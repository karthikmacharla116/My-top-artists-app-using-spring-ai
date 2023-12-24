package com.mta.model;

import java.util.List;

/**
 * Sample Output response
 * {
    "topArtists": [
        {
            "artistName": "Arijit Singh",
            "age": "48",
            "location": "Mumbai, Maharashtra",
            "country": "India",
            "topAlbumNames": [
                "Aashiqui 2",
                "Yeh Jawaani Hai Deewani",
                "Dilwale",
                "Baaghi 2",
                "Kabir Singh"
            ],
            "netWorth": "$50 million"
        },
        {
            "artistName": "Atif Aslam",
            "age": "45",
            "location": "Wazirabad, Punjab",
            "country": "India",
            "topAlbumNames": [
                "Jal Pari",
                "Doorie",
                "Meri Kahani",
                "Bol",
                "Race 2"
            ],
            "netWorth": "$22 million"
        },
        {
            "artistName": "Shreya Ghoshal",
            "age": "51",
            "location": "Berhampore, West Bengal",
            "country": "India",
            "topAlbumNames": [
                "Devdas",
                "Jab We Met",
                "Aashiqui 2",
                "Bajirao Mastani",
                "Padmaavat"
            ],
            "netWorth": "$25 million"
        },
        {
            "artistName": "Sonu Nigam",
            "age": "47",
            "location": "Faridabad, Haryana",
            "country": "India",
            "topAlbumNames": [
                "Deewana",
                "Jaan",
                "Kal Ho Naa Ho",
                "Om Shanti Om",
                "Ae Dil Hai Mushkil"
            ],
            "netWorth": "$50 million"
        },
        {
            "artistName": "Asha Bhosle",
            "age": "46",
            "location": "Sangli, Maharashtra",
            "country": "India",
            "topAlbumNames": [
                "Pakeezah",
                "Caravan",
                "Umrao Jaan",
                "Ijaazat",
                "Dilwale Dulhania Le Jayenge"
            ],
            "netWorth": "$40 million"
        }
    ]
} - JSON format
 */
public class Artists {

	private List<Artist> topArtists;

	public List<Artist> getTopArtists() {
		return topArtists;
	}

	public void setTopArtists(List<Artist> topArtists) {
		this.topArtists = topArtists;
	}
}
