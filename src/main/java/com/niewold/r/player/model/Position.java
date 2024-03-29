
/* generated by: ControllerGenerator Wed May 18 15:20:45 CEST 2016 */
package com.niewold.r.player.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String playerPosition;
    String PositionName;



    public Position() {
    }

    public Position(int id, String playerPosition, String PositionName) {
        this.id = id;
        this.playerPosition = playerPosition;
        this.PositionName = PositionName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public String getPositionName() {
        return PositionName;
    }

    public void setPositionName(String positionName) {
        PositionName = positionName;
    }

    @Override
    public String toString() {
        return "[Position: [" + "id: " + id + ", " + "position: " + playerPosition + "PositionName:" + PositionName + "]";
    }
}

