package com.beezy.websoa;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class WebSoaApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebSoaApplication.class, args);
	}
	@Autowired
	private Environment environment;
	
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("\nSbeezy JAVA SE TEST");
            
            
            
            DateFormat formatter = new SimpleDateFormat("dd-MMM-yy");
            
           
            
            System.out.println(Calendar.getInstance().getTimeInMillis());
//            // Génération de la clé
//            UUID uniqueKey1 = UUID.randomUUID();           
//            StringBuilder cle = new StringBuilder(uniqueKey1.toString());                     
//            cle.delete(0,25);
//            
//            // Récupération de la date d'envoie            
//            long timeStamp=1487603832215L;
//            Date date = new Date(timeStamp);
//            DateFormat formateur = new SimpleDateFormat("yyyy-MM-dd");
//            String dateFormater[] = formateur.format(date).split("-");            
//            String annee=dateFormater[0];
//            String mois=dateFormater[1];
//            String jour=dateFormater[2];
//            
//            // Gestion de la hiérachie des dossiers de sauvegarde
//            String racineDossier = environment.getProperty("emails.pieces.jointes");
//            String nomDossier ="";
//            // Dossier Annee
//            File dossierAnnee = new File(racineDossier+"\\"+annee);
//            if(!dossierAnnee.isDirectory() || !dossierAnnee.exists()){
//            	dossierAnnee.mkdir();
//            	nomDossier=dossierAnnee.toString();            	          
//            }else{
//            	nomDossier=dossierAnnee.toString();
//            }
//            // Dossier Mois
//            File dossierMois = new File(nomDossier+"\\"+mois);
//            if(!dossierMois.isDirectory() || !dossierMois.exists()){
//            	dossierMois.mkdir();
//            	nomDossier=dossierMois.toString();            	
//            }else{
//            	nomDossier=dossierMois.toString();
//            }
//            
//            // Sauvegarde du fichier dans le repertoire correspondant
//            try{
//                PrintWriter writer = new PrintWriter(nomDossier +"\\"+cle+".txt", "UTF-8");
//                // Ecirre le contenu du fichier
//                writer.println("The first line");
//                writer.println("The second line");
//                writer.close();
//            }catch (IOException e) {
//             System.out.println("Erreur lors du traitement du fichier " + e );
//            }
            
                       
            
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                //System.out.println(beanName);
//            }

        };
    }
}
