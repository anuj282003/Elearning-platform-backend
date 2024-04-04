package com.example.demo.utilities;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomRandomIdGenerator   implements IdentifierGenerator {

	@Override
	public Serializable  generate(SharedSessionContractImplementor session, Object object) {
		 String prefix = "KOD";
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	        int length = 10; // Length of the random part of the ID
	        
	        StringBuilder sb = new StringBuilder();
	        sb.append(prefix);
	        
	        Random random = new Random();
	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(characters.length());
	            sb.append(characters.charAt(index));
	        }
	        
	        return sb.toString();
	    }
	}


