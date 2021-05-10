package com.springmongo.inventorymanager.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection = "HomeDecor")
public class HomeDecor
{
    @Id
    private String id;
    private String Name;
    private String Brand;
    private String Category;
    private String Quantity;
    private String Value;
}
