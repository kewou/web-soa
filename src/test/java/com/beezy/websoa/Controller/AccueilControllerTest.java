package com.beezy.websoa.Controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.beezy.websoa.controller.AccueilController;
import com.beezy.websoa.entities.Etudiant;
import com.beezy.websoa.services.EtudiantServices;

@RunWith(SpringRunner.class)
@WebMvcTest(AccueilController.class)
public class AccueilControllerTest {
	
	@Autowired
	// Simuler le serveur
    private MockMvc mockMvc;
	
    @MockBean
    private EtudiantServices etuService;
    
    private Etudiant mockEtu;
    
    public AccueilControllerTest(){
        mockEtu = new Etudiant();
        mockEtu.setId(6);
        mockEtu.setNom("chris");
        mockEtu.setPrenom("paul");
        mockEtu.setPass("thuglife");
    }
    

    
    @Test
    public void detailsEtudiant() throws Exception{
    	Mockito.when(etuService.getEtudiantById(Mockito.anyInt())).thenReturn(mockEtu);
    	
    	RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/etudiants/6").accept(
				MediaType.APPLICATION_JSON);
    	
    	MvcResult result = mockMvc.perform(requestBuilder).andReturn();
    	
    	System.out.println(result.getResponse());
    	
    	String expected = "{id:6,nom:chris,prenom:paul,dateNaissance:,username:,pass:thuglife}";
    	
    	JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), false);

    }
    
//    @Test
//    public void testGetEtudiant() throws Exception {
//        given(this.etuService.getEtudiantById(6).getNom())
//                .willReturn("chris");
//        this.mvc.perform(get("/etudiants/6").accept(MediaType.TEXT_PLAIN))
//                .andExpect(status().isOk()).andExpect(content().string("Honda Civic"));
//    }

}
