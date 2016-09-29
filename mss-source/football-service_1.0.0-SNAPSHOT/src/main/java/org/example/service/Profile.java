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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ck
 */
@XmlRootElement(name = "RouteOption")
public class Profile {
    
    private String id;
    private Address[] partialRoutes;

    @XmlElement(name = "RouteId")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlElement(name = "PartialRoutes")
    public Address[] getPartialRoutes() {
        return partialRoutes;
    }

    public void setPartialRoutes(Address[] partialRoutes) {
        this.partialRoutes = partialRoutes;
    }
    
    
}