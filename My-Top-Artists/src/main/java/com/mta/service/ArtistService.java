package com.mta.service;

import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.parser.BeanOutputParser;
import org.springframework.ai.prompt.Prompt;
import org.springframework.ai.prompt.PromptTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mta.model.Artists;

@Service
public class ArtistService {

	@Autowired
	private ChatClient chatClient;

	public Artists fetchArtistsByCountry(String country) {
		BeanOutputParser<Artists> parser = new BeanOutputParser<Artists>(Artists.class);

		String textPrompt = 
				"Give me the Top Artists details of {country} along with their hit albums {format}";

		PromptTemplate promptTemplate = new PromptTemplate(textPrompt);
		promptTemplate.add("country", country);
		promptTemplate.add("format", parser.getFormat());
		promptTemplate.setOutputParser(parser);
		
		Prompt prompt = promptTemplate.create();
		
		String response = chatClient.generate(prompt).getGeneration().getContent();
		return parser.parse(response);
	}
}
