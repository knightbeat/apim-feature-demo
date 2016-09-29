/*
 * Copyright 2016 WSO2.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.example.service;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author ck
 */
public class Address {
     
    private String freeTextDescription;
    private String buildingNumber;
    private String street; 
    private String area;
    private String city;
    private String country;
    private String poBox;
    private String zipCode;
    private String careOf;
    private String villageName;
    private String district;

    public Address(String freeTextDescription, String buildingNumber, String street, String area, String city, String country, String poBox, String zipCode, String careOf, String villageName, String district) {
        this.freeTextDescription = freeTextDescription;
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.area = area;
        this.city = city;
        this.country = country;
        this.poBox = poBox;
        this.zipCode = zipCode;
        this.careOf = careOf;
        this.villageName = villageName;
        this.district = district;
    }

    public Address() {
    }

    public String getFreeTextDescription() {
        return freeTextDescription;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getArea() {
        return area;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getPoBox() {
        return poBox;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCareOf() {
        return careOf;
    }

    public String getVillageName() {
        return villageName;
    }

    public String getDistrict() {
        return district;
    }

    public void setFreeTextDescription(String freeTextDescription) {
        this.freeTextDescription = freeTextDescription;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPoBox(String poBox) {
        this.poBox = poBox;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCareOf(String careOf) {
        this.careOf = careOf;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    
    
}
