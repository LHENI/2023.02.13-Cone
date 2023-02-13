/*
* File: Cone.java
* Author: Laczkó Henrietta
* Copyright: 2023, Laczkó Henrietta
* Group: Szoft I-I N
* Date: 2023-02-13
* Github: https://github.com/LHENI/
* Licenc: GNU GPL
*/

public class Cone {
    public double calcVolume(double radium,double height) {
        double volume= 1.0/3.0 * Math.pow (radium,2) * Math.PI * height;
        return volume;
    }    
}
