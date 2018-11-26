package com.main;

import com.dao.ProductDAO;
import com.entity.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.util.CustomMapperUtil;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.lang.reflect.Field;

public class JUnitTest4 {
	@Test
	public void testCriteriaQuery()
	{
		Product product = new Product();
		product.setAggregatedStatus("something");
		product.setPuid("someIdProduct");
		ProductDAO productDAO = new ProductDAO();


		ProductPriceInfo productPriceInfo = new ProductPriceInfo();
		productPriceInfo.setPriceSourceName("sourceName");

		ProductStockInfo productStockInfo = new ProductStockInfo();
		productStockInfo.setStockSourceName("stockName");

		Manufacturer manufacturer = new Manufacturer();
		manufacturer.setId("someId");
		manufacturer.setName("manufacturerName");

		product.setProductPriceInfo(productPriceInfo);
		product.setProductStockInfo(productStockInfo);
		product.setManufacturer(manufacturer);
		productDAO.insert(product);
	}
	@Test
	public void testFromApi()
	{
		HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic("f8ab33b2-0855-491a-9a9f-6741246ed851", "cHURWTwdBJ2DeugBxXw8_4a13NL7A4vA2_1rSpxUw18");

		Client client = ClientBuilder.newClient();
		client.register(feature);

		Response response = client.target("https://api.itscope.com/2.0/products/exports/f8ab33b2-0855-491a-9a9f-6741246ed851").request().get();

		String jsonStringFromServer = (String) response.readEntity(String.class);

		JSONObject jsonObject = (JSONObject) JSONValue.parse(jsonStringFromServer);

		ObjectMapper objectMapper = new ObjectMapper();

		JSONArray jsonObjectProductList = (JSONArray)jsonObject.get("product");

		String clippedJsonString;

		ProductDAO productDAO = new ProductDAO();
		for(Object productObject : jsonObjectProductList)
		{
			clippedJsonString = CustomMapperUtil.getClippedJson(productObject.toString(),Product.class);
			Product product = null;
			try {
				product = objectMapper.readValue(clippedJsonString, Product.class);
			} catch (Exception e) {
				e.printStackTrace();
			}
			productDAO.insert(product);
			break;
		}
	}
}
