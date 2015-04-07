
/*
 *   Copyright 2014 University Of Wisconsin Parkside
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

package uwp.cs.edu.parkingtracker;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolygonOptions;

import java.util.HashMap;
import java.util.Map;

public final class CONSTANTS {

    // Prevent instantiation, even from the native class
    private CONSTANTS() {
        throw new AssertionError();
    }

    // REST related strings
    public static final String REST_URL = "http://eisner.io/parkingserver/";
    public static final String VOTE = "v/";
    public static final String VOTE_AVG = "va/";
    //    public static final String GET_ZONES = "z";
//    public static final String UPDATE = "update/";
//    public static final String EXPERT = "expert/";
//    public static final String VECTORSUB = "vectorsub/";
//    public static final String VECTORADD = "vectoradd/";
    public static final String RESET = "reset/";

    // Http Methods
    public static final String GET = "GET";
    public static final String PUT = "PUT";

//    // ParkingLot Description Constants
//    public static final int STUDENT_CENTER_PARKING_LOT = 0;

    /* Student Center Coordinates Begin Used for default map view*/
    public static final double STUDENT_CENTER_C_LAT = 42.648266;
    public static final double STUDENT_CENTER_C_LNG = -87.853041;
//    // Outer Bounds : Points rotate clockwise.
//    static final LatLng SOUTH_WEST_OUTER_BOUND_POINT = new LatLng(42.647674, -87.854104);
//    static final LatLng SOUTH_EAST_OUTER_BOUND_POINT = new LatLng(42.647647, -87.852137);
//    static final LatLng NORTH_EAST_OUTER_BOUND_POINT = new LatLng(42.648412, -87.852153);
//    static final LatLng NORTH_WEST_OUTER_BOUND_POINT = new LatLng(42.649037, -87.853996);
//
//    // Horizontal (East to West) seperators
//    static final LatLng FIRST_LOWER_ZONE_DIVIDER_EAST_POINT = new LatLng(42.648049, -87.852150);
//    static final LatLng FIRST_LOWER_ZONE_DIVIDER_WEST_POINT = new LatLng(42.648089, -87.854075);
//    static final LatLng SECOND_LOWER_ZONE_DIVIDER_EAST_POINT = new LatLng(42.648499, -87.854056);
//    static final LatLng SECOND_LOWER_ZONE_DIVIDER_WEST_POINT = new LatLng(42.648412, -87.852153);
//
//    // Vertical (North to South) seperators
//    static final LatLng FIRST_VERTICAL_ZONE_DIVIDER_NORTH_POINT = new LatLng(42.648825, -87.853363);
//    static final LatLng FIRST_VERTICAL_ZONE_DIVIDER_SOUTH_POINT = new LatLng(42.647671, -87.853373);
//    /* Student Center Coordinates End */

    /* Talent (T) Coordinates Begin*/
    static final LatLng T_Row_1_Point_1 = new LatLng(42.649226, -87.848384);
    static final LatLng T_Row_1_Point_2 = new LatLng(42.649222, -87.847613);
    static final LatLng T_Row_1_Point_3 = new LatLng(42.649190, -87.846760);

    static final LatLng T_Row_2_Point_1 = new LatLng(42.648808, -87.848421);
    static final LatLng T_Row_2_Point_2 = new LatLng(42.648801, -87.847605);
    static final LatLng T_Row_2_Point_3 = new LatLng(42.648785, -87.846757);

    static final LatLng T_Row_3_Point_1 = new LatLng(42.648367, -87.848478);
    static final LatLng T_Row_3_Point_2 = new LatLng(42.648358, -87.847644);
    static final LatLng T_Row_3_Point_3 = new LatLng(42.648333, -87.846739);

    static final LatLng T_Row_4_Point_1 = new LatLng(42.647981, -87.848403);
    static final LatLng T_Row_4_Point_2 = new LatLng(42.648082, -87.847627);
    static final LatLng T_Row_4_Point_3 = new LatLng(42.647981, -87.846827);
    /* Talent (T) Coordinates End*/

    /* Talent (T) Polygons Begin*/
    static final PolygonOptions T_Zone_1 = new PolygonOptions()
            .add(T_Row_1_Point_1, T_Row_1_Point_2, T_Row_2_Point_2, T_Row_2_Point_1);
    static final PolygonOptions T_Zone_2 = new PolygonOptions()
            .add(T_Row_1_Point_2, T_Row_1_Point_3, T_Row_2_Point_3, T_Row_2_Point_2);
    static final PolygonOptions T_Zone_3 = new PolygonOptions()
            .add(T_Row_2_Point_1, T_Row_2_Point_2, T_Row_3_Point_2, T_Row_3_Point_1);
    static final PolygonOptions T_Zone_4 = new PolygonOptions()
            .add(T_Row_2_Point_2, T_Row_2_Point_3, T_Row_3_Point_3, T_Row_3_Point_2);
    static final PolygonOptions T_Zone_5 = new PolygonOptions()
            .add(T_Row_3_Point_1, T_Row_3_Point_2, T_Row_4_Point_2, T_Row_4_Point_1);
    static final PolygonOptions T_Zone_6 = new PolygonOptions()
            .add(T_Row_3_Point_2, T_Row_3_Point_3, T_Row_4_Point_3, T_Row_4_Point_2);
    /* Talent (T) Polygons End*/

    /* Student_Center (A) Coordinates Begin*/
    static final LatLng A_Row_1_Point_1 = new LatLng(42.649125, -87.853941);

    static final LatLng A_Row_2_Point_1 = new LatLng(42.648511, -87.854008);
    static final LatLng A_Row_2_Point_2 = new LatLng(42.648516, -87.853350);
    static final LatLng A_Row_2_Point_3 = new LatLng(42.648455, -87.851937);

    static final LatLng A_Row_3_Point_1 = new LatLng(42.648095, -87.854203);
    static final LatLng A_Row_3_Point_2 = new LatLng(42.648077, -87.853363);
    static final LatLng A_Row_3_Point_3 = new LatLng(42.648071, -87.852174);

    static final LatLng A_Row_4_Point_1 = new LatLng(42.647685, -87.854255);
    static final LatLng A_Row_4_Point_2 = new LatLng(42.647670, -87.853375);
    static final LatLng A_Row_4_Point_3 = new LatLng(42.647653, -87.852202);

    static final LatLng A_Row_5_Point_1 = new LatLng(42.647479, -87.854288);
    static final LatLng A_Row_5_Point_2 = new LatLng(42.647420, -87.853387);
    static final LatLng A_Row_5_Point_3 = new LatLng(42.647421, -87.852199);
    /* Student_Center (A) Coordinates End*/

    /* Student_Center (A) Polygons Begin*/
    static final PolygonOptions A_Zone_1 = new PolygonOptions()
            .add(A_Row_1_Point_1, A_Row_2_Point_3, A_Row_2_Point_2, A_Row_2_Point_1);
    static final PolygonOptions A_Zone_2 = new PolygonOptions()
            .add(A_Row_2_Point_1, A_Row_2_Point_2, A_Row_3_Point_2, A_Row_3_Point_1);
    static final PolygonOptions A_Zone_3 = new PolygonOptions()
            .add(A_Row_2_Point_2, A_Row_2_Point_3, A_Row_3_Point_3, A_Row_3_Point_2);
    static final PolygonOptions A_Zone_4 = new PolygonOptions()
            .add(A_Row_3_Point_1, A_Row_3_Point_2, A_Row_4_Point_2, A_Row_4_Point_1);
    static final PolygonOptions A_Zone_5 = new PolygonOptions()
            .add(A_Row_3_Point_2, A_Row_3_Point_3, A_Row_4_Point_3, A_Row_4_Point_2);
    static final PolygonOptions A_Zone_6 = new PolygonOptions()
            .add(A_Row_4_Point_1, A_Row_4_Point_2, A_Row_5_Point_2, A_Row_5_Point_1);
    static final PolygonOptions A_Zone_7 = new PolygonOptions()
            .add(A_Row_4_Point_2, A_Row_4_Point_3, A_Row_5_Point_3, A_Row_5_Point_2);
    /*Student_Center (A) Polygons End*/

    /* Rita_Main (B) Coordinates Begin*/
    static final LatLng B_Row_1_Point_1 = new LatLng(42.645479, -87.859190);
    static final LatLng B_Row_1_Point_2 = new LatLng(42.645479, -87.858650);
    static final LatLng B_Row_1_Point_3 = new LatLng(42.645479, -87.858105);
    static final LatLng B_Row_1_Point_4 = new LatLng(42.645446, -87.857409);

    static final LatLng B_Row_2_Point_1 = new LatLng(42.645105, -87.859239);
    static final LatLng B_Row_2_Point_2 = new LatLng(42.645094, -87.858665);
    static final LatLng B_Row_2_Point_3 = new LatLng(42.645089, -87.858115);
    static final LatLng B_Row_2_Point_4 = new LatLng(42.645065, -87.857405);

    static final LatLng B_Row_3_Point_1 = new LatLng(42.644728, -87.859244);
    static final LatLng B_Row_3_Point_2 = new LatLng(42.644719, -87.858675);
    static final LatLng B_Row_3_Point_3 = new LatLng(42.644705, -87.858349);
    static final LatLng B_Row_3_Point_4 = new LatLng(42.644705, -87.858128);
    static final LatLng B_Row_3_Point_5 = new LatLng(42.644671, -87.857422);

    static final LatLng B_Row_4_Point_1 = new LatLng(42.644529, -87.859247);
    static final LatLng B_Row_4_Point_2 = new LatLng(42.644486, -87.858366);
    static final LatLng B_Row_4_Point_3 = new LatLng(42.644463, -87.857418);
    /* Rita_Main (B) Coordinates End*/

    /* Rita_Main (B) Polygons Begin*/
    static final PolygonOptions B_Zone_1 = new PolygonOptions()
            .add(B_Row_1_Point_1, B_Row_1_Point_2, B_Row_2_Point_2, B_Row_2_Point_1);
    static final PolygonOptions B_Zone_2 = new PolygonOptions()
            .add(B_Row_1_Point_2, B_Row_1_Point_3, B_Row_2_Point_3, B_Row_2_Point_2);
    static final PolygonOptions B_Zone_3 = new PolygonOptions()
            .add(B_Row_1_Point_3, B_Row_1_Point_4, B_Row_2_Point_4, B_Row_2_Point_3);
    static final PolygonOptions B_Zone_4 = new PolygonOptions()
            .add(B_Row_2_Point_1, B_Row_2_Point_2, B_Row_3_Point_2, B_Row_3_Point_1);
    static final PolygonOptions B_Zone_5 = new PolygonOptions()
            .add(B_Row_2_Point_2, B_Row_2_Point_3, B_Row_3_Point_4, B_Row_3_Point_2);
    static final PolygonOptions B_Zone_6 = new PolygonOptions()
            .add(B_Row_2_Point_3, B_Row_2_Point_4, B_Row_3_Point_5, B_Row_3_Point_4);
    static final PolygonOptions B_Zone_7 = new PolygonOptions()
            .add(B_Row_3_Point_1, B_Row_3_Point_3, B_Row_4_Point_2, B_Row_4_Point_1);
    static final PolygonOptions B_Zone_8 = new PolygonOptions()
            .add(B_Row_3_Point_3, B_Row_3_Point_5, B_Row_4_Point_3, B_Row_4_Point_2);
    /* Rita_Main (B) Polygons End*/

    /* Rita_Overflow (C) Coordinates Begin*/
    static final LatLng C_Row_1_Point_1 = new LatLng(42.644346, -87.858951);
    static final LatLng C_Row_1_Point_2 = new LatLng(42.644347, -87.858080);
    static final LatLng C_Row_1_Point_3 = new LatLng(42.644342, -87.857582);

    static final LatLng C_Row_2_Point_1 = new LatLng(42.643981, -87.858963);
    static final LatLng C_Row_2_Point_2 = new LatLng(42.643957, -87.858093);
    static final LatLng C_Row_2_Point_3 = new LatLng(42.643940, -87.857292);

    static final LatLng C_Row_3_Point_1 = new LatLng(42.643708, -87.85871);
    static final LatLng C_Row_3_Point_2 = new LatLng(42.643674, -87.858041);
    static final LatLng C_Row_3_Point_3 = new LatLng(42.643665, -87.857145);

    static final LatLng C_Row_4_Point_1 = new LatLng(42.643407, -87.858041);
    static final LatLng C_Row_4_Point_2 = new LatLng(42.643386, -87.857100);
    /* Rita_Overflow (C) Coordinates End*/

    /* Rita_Overflow (C) Polygons Begin*/
    static final PolygonOptions C_Zone_1 = new PolygonOptions()
            .add(C_Row_1_Point_1, C_Row_1_Point_2, C_Row_2_Point_2, C_Row_2_Point_1);
    static final PolygonOptions C_Zone_2 = new PolygonOptions()
            .add(C_Row_1_Point_2, C_Row_1_Point_3, C_Row_2_Point_3, C_Row_2_Point_2);
    static final PolygonOptions C_Zone_3 = new PolygonOptions()
            .add(C_Row_2_Point_1, C_Row_2_Point_2, C_Row_3_Point_2, C_Row_4_Point_1, C_Row_3_Point_1);
    static final PolygonOptions C_Zone_4 = new PolygonOptions()
            .add(C_Row_2_Point_2, C_Row_2_Point_3, C_Row_3_Point_3, C_Row_3_Point_2);
    static final PolygonOptions C_Zone_5 = new PolygonOptions()
            .add(C_Row_3_Point_2, C_Row_3_Point_3, C_Row_4_Point_2, C_Row_4_Point_1);
    /* Rita_Overflow (C) Polygons End*/

    /* SAC_Main (D) Coordinates Begin*/
    static final LatLng D_Row_1_Point_1 = new LatLng(42.641491, -87.856943);
    static final LatLng D_Row_1_Point_2 = new LatLng(42.641751, -87.856552);
    static final LatLng D_Row_1_Point_3 = new LatLng(42.641906, -87.856310);
    static final LatLng D_Row_1_Point_4 = new LatLng(42.641875, -87.855965);

    static final LatLng D_Row_2_Point_1 = new LatLng(42.641251, -87.856630);
    static final LatLng D_Row_2_Point_2 = new LatLng(42.641507, -87.856232);
    static final LatLng D_Row_2_Point_3 = new LatLng(42.641748, -87.855838);

    static final LatLng D_Row_3_Point_1 = new LatLng(42.640997, -87.856339);
    static final LatLng D_Row_3_Point_2 = new LatLng(42.641208, -87.856019);
    static final LatLng D_Row_3_Point_3 = new LatLng(42.641273, -87.855944);
    static final LatLng D_Row_3_Point_4 = new LatLng(42.641413, -87.855725);
    static final LatLng D_Row_3_Point_5 = new LatLng(42.641519, -87.855567);

    static final LatLng D_Row_4_Point_1 = new LatLng(42.640796, -87.856064);
    static final LatLng D_Row_4_Point_2 = new LatLng(42.640992, -87.855772);
    static final LatLng D_Row_4_Point_3 = new LatLng(42.641187, -87.855450);

    static final LatLng D_Row_5_Point_1 = new LatLng(42.640517, -87.855700);
    static final LatLng D_Row_5_Point_2 = new LatLng(42.640719, -87.855413);
    static final LatLng D_Row_5_Point_3 = new LatLng(42.640719, -87.855413);
    /* SAC_Main (D) Coordinates End*/

    /* SAC_Main (D) Polygons Begin*/
    static final PolygonOptions D_Zone_1 = new PolygonOptions()
            .add(D_Row_1_Point_1, D_Row_1_Point_2, D_Row_2_Point_2, D_Row_2_Point_1);
    static final PolygonOptions D_Zone_2 = new PolygonOptions()
            .add(D_Row_1_Point_2, D_Row_1_Point_3, D_Row_1_Point_4, D_Row_2_Point_3, D_Row_2_Point_2);
    static final PolygonOptions D_Zone_3 = new PolygonOptions()
            .add(D_Row_2_Point_1, D_Row_2_Point_2, D_Row_3_Point_3, D_Row_3_Point_2, D_Row_3_Point_1);
    static final PolygonOptions D_Zone_4 = new PolygonOptions()
            .add(D_Row_2_Point_2, D_Row_2_Point_3, D_Row_3_Point_5, D_Row_3_Point_4, D_Row_3_Point_3);
    static final PolygonOptions D_Zone_5 = new PolygonOptions()
            .add(D_Row_3_Point_1, D_Row_3_Point_2, D_Row_4_Point_2, D_Row_4_Point_1);
    static final PolygonOptions D_Zone_6 = new PolygonOptions()
            .add(D_Row_3_Point_2, D_Row_3_Point_3, D_Row_3_Point_4, D_Row_4_Point_3, D_Row_4_Point_2);
    static final PolygonOptions D_Zone_7 = new PolygonOptions()
            .add(D_Row_4_Point_1, D_Row_4_Point_2, D_Row_5_Point_2, D_Row_5_Point_1);
    static final PolygonOptions D_Zone_8 = new PolygonOptions()
            .add(D_Row_4_Point_2, D_Row_4_Point_3, D_Row_5_Point_3, D_Row_5_Point_2);
    /* SAC_Main (D) Polygons End*/

    /* SAC_Overflow (E) Coordinates Begin*/
    static final LatLng E_Row_1_Point_1 = new LatLng(42.643047, -87.858129);
    static final LatLng E_Row_1_Point_2 = new LatLng(42.643041, -87.857582);

    static final LatLng E_Row_2_Point_1 = new LatLng(42.642373, -87.858154);
    static final LatLng E_Row_2_Point_2 = new LatLng(42.642354, -87.857605);
    /* SAC_Overflow (E) Coordinates End*/

    /* SAC_Overflow (E) Polygons Begin*/
    static final PolygonOptions E_Zone_1 = new PolygonOptions()
            .add(E_Row_1_Point_1, E_Row_1_Point_2, E_Row_2_Point_2, E_Row_2_Point_1);
    /* SAC_Overflow (E) Polygons End*/

    // Map Constants
    public static final float DEFAULT_ZOOM_FACTOR = 17;
    public static final float DEFAULT_LINE_WIDTH = 5;

    /* Temp. Authorization Constants */
//    public static final String USERNAME = "david";
//    public static final String PASSWORD = "1234";

    public static final Map<String, LatLng> buildings = new HashMap<String, LatLng>();
    public static final Map<String, LatLng> parkingLots = new HashMap<String, LatLng>();
    public static final Map<String, PolygonOptions> zones = new HashMap<String, PolygonOptions>();

    static {
        buildings.put("Greenquist Hall", new LatLng(42.646397, -87.855553));
        buildings.put("Sports and Activity Center", new LatLng(42.64253, -87.856681));
        buildings.put("Wyllie Hall", new LatLng(42.645505, -87.855124));
        buildings.put("Rita Tallent Picken Regional Center for Arts and Humanities", new LatLng(42.645257, -87.856353));
        buildings.put("Molinaro Hall", new LatLng(42.647024, -87.856256));
        buildings.put("Student Center", new LatLng(42.64782, -87.854842));
        //In wrong spot
        //buildings.put("Library", new LatLng(42.647679, -87.855405));
        buildings.put("University Apartments", new LatLng(42.648881, -87.857133));
        buildings.put("Ranger Hall", new LatLng(42.646904, -87.857972));
        buildings.put("Pike River Suites", new LatLng(42.648607, -87.854778));
        buildings.put("Student Health And Counseling Center", new LatLng(42.64796, -87.846231));
        buildings.put("Tallent Hall", new LatLng(42.647518, -87.847593));
        buildings.put("Facilities Management Complex", new LatLng(42.649597, -87.847796));
        parkingLots.put("Parking Lot A", new LatLng(42.648019, -87.853306));
        parkingLots.put("Parking Lot B", new LatLng(42.645004, -87.858295));
        parkingLots.put("Parking Lot C", new LatLng(42.643951, -87.858026));
        parkingLots.put("Parking Lot D", new LatLng(42.6427, -87.857822));
        parkingLots.put("Parking Lot E", new LatLng(42.641504, -87.856192));
        parkingLots.put("Parking Lot T", new LatLng(42.64854, -87.847608));


        zones.put("Talent_1", T_Zone_1);
        zones.put("Talent_2", T_Zone_2);
        zones.put("Talent_3", T_Zone_3);
        zones.put("Talent_4", T_Zone_4);
        zones.put("Talent_5", T_Zone_5);
        zones.put("Talent_6", T_Zone_6);
        zones.put("Student_Center_1", A_Zone_1);
        zones.put("Student_Center_2", A_Zone_2);
        zones.put("Student_Center_3", A_Zone_3);
        zones.put("Student_Center_4", A_Zone_4);
        zones.put("Student_Center_5", A_Zone_5);
        zones.put("Student_Center_6", A_Zone_6);
        zones.put("Student_Center_7", A_Zone_7);
        zones.put("Rita_Main_1", B_Zone_1);
        zones.put("Rita_Main_2", B_Zone_2);
        zones.put("Rita_Main_3", B_Zone_3);
        zones.put("Rita_Main_4", B_Zone_4);
        zones.put("Rita_Main_5", B_Zone_5);
        zones.put("Rita_Main_6", B_Zone_6);
        zones.put("Rita_Main_7", B_Zone_7);
        zones.put("Rita_Main_8", B_Zone_8);
        zones.put("Rita_Overflow_1", C_Zone_1);
        zones.put("Rita_Overflow_2", C_Zone_2);
        zones.put("Rita_Overflow_3", C_Zone_3);
        zones.put("Rita_Overflow_4", C_Zone_4);
        zones.put("Rita_Overflow_5", C_Zone_5);
        zones.put("SAC_Main_1", D_Zone_1);
        zones.put("SAC_Main_2", D_Zone_2);
        zones.put("SAC_Main_3", D_Zone_3);
        zones.put("SAC_Main_4", D_Zone_4);
        zones.put("SAC_Main_5", D_Zone_5);
        zones.put("SAC_Main_6", D_Zone_6);
        zones.put("SAC_Main_7", D_Zone_7);
        zones.put("SAC_Main_8", D_Zone_8);
        zones.put("SAC_Overflow_1", E_Zone_1);
    }
}
