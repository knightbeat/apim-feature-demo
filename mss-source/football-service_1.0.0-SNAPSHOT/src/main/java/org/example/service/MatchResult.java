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

/**
 *
 * @author ck
 */
public class MatchResult {
    private String tournamentID;
    private String recordID;
    private String teamA;
    private String teamB;
    private int teamAscore;
    private int teamBScore;

    public MatchResult(String tournamentID, String recordID, String teamA, String teamB, int teamAscore, int teamBScore) {
        this.tournamentID = tournamentID;
        this.recordID = recordID;
        this.teamA = teamA;
        this.teamB = teamB;
        this.teamAscore = teamAscore;
        this.teamBScore = teamBScore;
    }

    public MatchResult() {
    }
    
    public String getTournamentID() {
        return tournamentID;
    }

    public String getRecordID() {
        return recordID;
    }
    
    public String getTeamA() {
        return teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public int getTeamAscore() {
        return teamAscore;
    }

    public int getTeamBScore() {
        return teamBScore;
    }

    public void setTournamentID(String tournamentID) {
        this.tournamentID = tournamentID;
    }

    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    public void setTeamAscore(int teamAscore) {
        this.teamAscore = teamAscore;
    }

    public void setTeamBScore(int teamBScore) {
        this.teamBScore = teamBScore;
    }
    
    
    
}
