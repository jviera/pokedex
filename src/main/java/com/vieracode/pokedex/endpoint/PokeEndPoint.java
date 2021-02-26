/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vieracode.pokedex.endpoint;

import com.vieracode.pokedex.schema.Ability;
import com.vieracode.pokedex.schema.HeldItem;
import com.vieracode.pokedex.schema.Pokemon;
import com.vieracode.pokedex.xml.school.AbilitiesRequest;
import com.vieracode.pokedex.xml.school.AbilitiesResponse;
import com.vieracode.pokedex.xml.school.BaseExperienceRequest;
import com.vieracode.pokedex.xml.school.BaseExperienceResponse;
import com.vieracode.pokedex.xml.school.HeldItemsRequest;
import com.vieracode.pokedex.xml.school.HeldItemsResponse;
import com.vieracode.pokedex.xml.school.IdRequest;
import com.vieracode.pokedex.xml.school.IdResponse;
import com.vieracode.pokedex.xml.school.ListType;
import com.vieracode.pokedex.xml.school.LocationAreaEncountersRequest;
import com.vieracode.pokedex.xml.school.LocationAreaEncountersResponse;
import com.vieracode.pokedex.xml.school.NameRequest;
import com.vieracode.pokedex.xml.school.NameResponse;
import java.net.URI;
import javax.annotation.PostConstruct;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 *
 * @author jbvie
 */
@Endpoint
public class PokeEndPoint {

    private static final String NAMESPACE_URI = "http://www.pokedex.vieracode.com/xml/school";
    private static final String BASE_URL = "https://pokeapi.co/api/v2/pokemon/";
    private RestTemplate restTemplate;

    @PostConstruct
    public void init() {
        try {
            CloseableHttpClient httpClient = HttpClients.custom()
                    .setSSLHostnameVerifier(new NoopHostnameVerifier())
                    .build();
            HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
            requestFactory.setHttpClient(httpClient);
            restTemplate = new RestTemplate(requestFactory);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AbilitiesRequest")
    public AbilitiesResponse abilities(@RequestPayload AbilitiesRequest request) {
        AbilitiesResponse response = new AbilitiesResponse();
        response.setAbilities(new ListType());
        try {           
            String url = BASE_URL + request.getName();
            System.out.println("url: "+url);
            URI uri = new URI(url);
            ResponseEntity<Pokemon> pokemon = restTemplate.getForEntity(uri, Pokemon.class);
            
            for (Ability ability : pokemon.getBody().getAbilities()) {
                response.getAbilities().getChild().add(ability.getAbility().getName());
                
            }
            
        } catch (Exception e) {
            System.out.println("----------------> se genero un error!");
            e.printStackTrace();
        }
        return response;
    }      
    
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "BaseExperienceRequest")
    public BaseExperienceResponse baseExperience(@RequestPayload BaseExperienceRequest request) {
        BaseExperienceResponse response = new BaseExperienceResponse();
        try {
            String url = BASE_URL + request.getName();
            System.out.println("url: "+url);
            URI uri = new URI(url);
            ResponseEntity<Pokemon> pokemon = restTemplate.getForEntity(uri, Pokemon.class);
            response.setBaseExperience(pokemon.getBody().getBaseExperience());            
        } catch (Exception e) {
            System.out.println("----------------> se genero un error!");
            e.printStackTrace();
        }
        return response;
    }

    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "HeldItemsRequest")
    public HeldItemsResponse heldItems(@RequestPayload HeldItemsRequest request) {
        HeldItemsResponse response = new HeldItemsResponse();
        response.setHeldItems(new ListType());
        try {
            String url = BASE_URL + request.getName();
            System.out.println("url: "+url);
            URI uri = new URI(url);
            ResponseEntity<Pokemon> pokemon = restTemplate.getForEntity(uri, Pokemon.class);
            for (HeldItem heldItem : pokemon.getBody().getHeldItems()) {
                response.getHeldItems().getChild().add(heldItem.getItem().getName());
            }
        } catch (Exception e) {
            System.out.println("----------------> se genero un error!");
            e.printStackTrace();
        }
        return response;
    }
    
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "IdRequest")
    public IdResponse id(@RequestPayload IdRequest request) {
        IdResponse response = new IdResponse();
        try {
            String url = BASE_URL + request.getName();
            System.out.println("url: "+url);
            URI uri = new URI(url);
            ResponseEntity<Pokemon> pokemon = restTemplate.getForEntity(uri, Pokemon.class);
            response.setId(pokemon.getBody().getId());
        } catch (Exception e) {
            System.out.println("----------------> se genero un error!");
            e.printStackTrace();
        }
        return response;
    }
    
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "NameRequest")
    public NameResponse name(@RequestPayload NameRequest request) {
        NameResponse response = new NameResponse();
        try {
            String url = BASE_URL + request.getName();
            System.out.println("url: "+url);
            URI uri = new URI(url);
            ResponseEntity<Pokemon> pokemon = restTemplate.getForEntity(uri, Pokemon.class);
            response.setName(pokemon.getBody().getName());
        } catch (Exception e) {
            System.out.println("----------------> se genero un error!");
            e.printStackTrace();
        }
        return response;
    }
    
    @ResponsePayload
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "LocationAreaEncountersRequest")
    public LocationAreaEncountersResponse locationAreaEncounters(@RequestPayload LocationAreaEncountersRequest request) {
        LocationAreaEncountersResponse response = new LocationAreaEncountersResponse();
        try {
            String url = BASE_URL + request.getName();
            System.out.println("url: "+url);
            URI uri = new URI(url);
            ResponseEntity<Pokemon> pokemon = restTemplate.getForEntity(uri, Pokemon.class);
            response.setLocationAreaEncounters(pokemon.getBody().getLocationAreaEncounters());
        } catch (Exception e) {
            System.out.println("----------------> se genero un error!");
            e.printStackTrace();
        }
        return response;
    }    
}