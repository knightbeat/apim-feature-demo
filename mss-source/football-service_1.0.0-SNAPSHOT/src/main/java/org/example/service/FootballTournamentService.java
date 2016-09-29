/*
 * Copyright (c) 2016, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.example.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Contact;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Api(value = "football-tournaments")
@SwaggerDefinition(
        info = @Info(
                title = "FootballTournamentsService", version = "1.0",
                description = "This REST service provides information related to currently played football matches",
                license = @License(name = "Apache 2.0", url = "http://www.apache.org/licenses/LICENSE-2.0"),
                contact = @Contact(
                        name = "Chathura Kulasinghe",
                        email = "chathurak@wso2.com",
                        url = "http://wso2.com"
                ))
)
@Path("/matches")
public class FootballTournamentService {

    private Map<String, MatchResult> matchResults = new HashMap<>();

    public FootballTournamentService() {
        MatchResult result1 = new MatchResult("EUL2016", "1", "MONACO", "LEVERKUSEN", 1, 1);
        MatchResult result2 = new MatchResult("EUL2016", "2", "CSKA MOSKVA", "TOTTENHAM", 0, 1);
        MatchResult result3 = new MatchResult("EUL2016", "3", "DORTMAND", "REAL MADRID", 2, 2);
        MatchResult result4 = new MatchResult("EUL2016", "4", "SPORTING CP", "LEGIA", 2, 0);
        MatchResult result5 = new MatchResult("EUL2016", "5", "KOBENHAVN", "CLUB BRUGGE", 4, 0);
        MatchResult result6 = new MatchResult("EUL2016", "6", "LEICHESTER", "PORTO", 1, 0);
        MatchResult result7 = new MatchResult("EUL2016", "7", "SEVILLA", "LYON", 1, 0);
        MatchResult result8 = new MatchResult("EUL2016", "8", "DINAMO SAGREB", "JUVENTUS", 0, 4);

        matchResults.put(result1.getRecordID(), result1);
        matchResults.put(result2.getRecordID(), result2);
        matchResults.put(result3.getRecordID(), result3);
        matchResults.put(result4.getRecordID(), result4);
        matchResults.put(result5.getRecordID(), result5);
        matchResults.put(result6.getRecordID(), result6);
        matchResults.put(result7.getRecordID(), result7);
        matchResults.put(result8.getRecordID(), result8);
    }
    
    @GET
    @Path("/{tournementID}/results")
    @Produces({"application/json", "text/xml"})
    @ApiOperation(
            value = "Returns current match results of a particular tournament",
            notes = "Returns HTTP 404 if the route is not found")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Valid match results set is found"),
        @ApiResponse(code = 404, message = "Valid match results set is not found")})
    public Map<String,MatchResult> getRouteById(@ApiParam(value = "tournementID", required = true)
            @PathParam("tournementID") String tournementID) {
        // TODO: Implementation for HTTP GET request
        System.out.println("GET invoked");

        return this.matchResults;
    }

    @GET
    @Path("/{tournementID}/results/{recordId}")
    @Produces({"application/json", "text/xml"})
    @ApiOperation(
            value = "Returns a results record of a current match of a particular tournament",
            notes = "Returns HTTP 404 if the route is not found")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Valid travel route option found"),
        @ApiResponse(code = 404, message = "Travel route option not found")})
    public MatchResult getRouteById(@ApiParam(value = "tournementID", required = true) @PathParam("tournementID") String tournementID, 
            @ApiParam(value = "recordId", required = true) @PathParam("recordId") String recordId) {
        // TODO: Implementation for HTTP GET request
        System.out.println("GET invoked");

        return this.matchResults.get(recordId);
    }

}
