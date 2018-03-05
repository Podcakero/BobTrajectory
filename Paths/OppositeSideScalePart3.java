package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class OppositeSideScalePart3 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (3.17,0.00,0.00)
	
	public OppositeSideScalePart3() {
		this(false);
	}
			
    public OppositeSideScalePart3(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.015,0.291,10.000,0.000},
				{0.073,0.581,10.000,0.000},
				{0.203,1.307,10.000,0.000},
				{0.436,2.324,10.000,0.000},
				{0.799,3.631,10.000,0.000},
				{1.307,5.084,10.000,0.000},
				{1.961,6.536,10.000,0.000},
				{2.760,7.989,10.000,0.000},
				{3.704,9.442,10.000,0.000},
				{4.793,10.894,10.000,0.000},
				{6.028,12.347,10.000,0.000},
				{7.408,13.799,10.000,0.000},
				{8.933,15.252,10.000,0.000},
				{10.604,16.704,10.000,0.000},
				{12.419,18.157,10.000,0.000},
				{14.380,19.609,10.000,0.000},
				{16.486,21.062,10.000,0.000},
				{18.738,22.514,10.000,0.000},
				{21.134,23.967,10.000,0.000},
				{23.676,25.419,10.000,0.000},
				{26.364,26.872,10.000,0.000},
				{29.196,28.325,10.000,0.000},
				{32.174,29.777,10.000,0.000},
				{35.297,31.230,10.000,0.000},
				{38.565,32.682,10.000,0.000},
				{41.978,34.135,10.000,0.000},
				{45.537,35.587,10.000,0.000},
				{49.241,37.040,10.000,0.000},
				{53.090,38.492,10.000,0.000},
				{57.085,39.945,10.000,0.000},
				{61.225,41.397,10.000,0.000},
				{65.510,42.850,10.000,0.000},
				{69.940,44.302,10.000,0.000},
				{74.515,45.755,10.000,0.000},
				{79.236,47.208,10.000,0.000},
				{84.102,48.660,10.000,0.000},
				{89.113,50.113,10.000,0.000},
				{94.270,51.565,10.000,0.000},
				{99.572,53.018,10.000,0.000},
				{105.019,54.470,10.000,0.000},
				{110.611,55.923,10.000,0.000},
				{116.348,57.375,10.000,0.000},
				{122.231,58.828,10.000,0.000},
				{128.259,60.280,10.000,0.000},
				{134.433,61.733,10.000,0.000},
				{140.751,63.185,10.000,0.000},
				{147.215,64.638,10.000,0.000},
				{153.824,66.091,10.000,0.000},
				{160.578,67.543,10.000,0.000},
				{167.478,68.996,10.000,0.000},
				{174.523,70.448,10.000,0.000},
				{181.713,71.901,10.000,0.000},
				{189.048,73.353,10.000,0.000},
				{196.529,74.806,10.000,0.000},
				{204.154,76.258,10.000,0.000},
				{211.926,77.711,10.000,0.000},
				{219.842,79.163,10.000,0.000},
				{227.903,80.616,10.000,0.000},
				{236.110,82.068,10.000,0.000},
				{244.462,83.521,10.000,0.000},
				{252.960,84.974,10.000,0.000},
				{261.602,86.426,10.000,0.000},
				{270.390,87.879,10.000,0.000},
				{279.323,89.331,10.000,0.000},
				{288.402,90.784,10.000,0.000},
				{297.625,92.236,10.000,0.000},
				{306.994,93.689,10.000,0.000},
				{316.508,95.141,10.000,0.000},
				{326.168,96.594,10.000,0.000},
				{335.972,98.046,10.000,0.000},
				{345.922,99.499,10.000,0.000},
				{356.017,100.951,10.000,0.000},
				{366.258,102.404,10.000,0.000},
				{376.643,103.857,10.000,0.000},
				{387.174,105.309,10.000,0.000},
				{397.851,106.762,10.000,0.000},
				{408.672,108.214,10.000,0.000},
				{419.639,109.667,10.000,0.000},
				{430.751,111.119,10.000,0.000},
				{442.008,112.572,10.000,0.000},
				{453.410,114.024,10.000,0.000},
				{464.958,115.477,10.000,0.000},
				{476.651,116.929,10.000,0.000},
				{488.489,118.382,10.000,0.000},
				{500.472,119.835,10.000,0.000},
				{512.601,121.287,10.000,0.000},
				{524.875,122.740,10.000,0.000},
				{537.294,124.192,10.000,0.000},
				{549.859,125.645,10.000,0.000},
				{562.569,127.097,10.000,0.000},
				{575.424,128.550,10.000,0.000},
				{588.424,130.002,10.000,0.000},
				{601.569,131.455,10.000,0.000},
				{614.860,132.907,10.000,0.000},
				{628.296,134.360,10.000,0.000},
				{641.877,135.812,10.000,0.000},
				{655.604,137.265,10.000,0.000},
				{669.475,138.718,10.000,0.000},
				{683.492,140.170,10.000,0.000},
				{697.655,141.623,10.000,0.000},
				{711.962,143.075,10.000,0.000},
				{726.400,144.382,10.000,0.000},
				{740.940,145.399,10.000,0.000},
				{755.553,146.125,10.000,0.000},
				{770.209,146.561,10.000,0.000},
				{784.869,146.601,10.000,0.000},
				{799.493,146.243,10.000,0.000},
				{814.053,145.596,10.000,0.000},
				{828.519,144.658,10.000,0.000},
				{842.862,143.429,10.000,0.000},
				{857.063,142.016,10.000,0.000},
				{871.120,140.563,10.000,0.000},
				{885.031,139.111,10.000,0.000},
				{898.796,137.658,10.000,0.000},
				{912.417,136.206,10.000,0.000},
				{925.892,134.753,10.000,0.000},
				{939.222,133.300,10.000,0.000},
				{952.407,131.848,10.000,0.000},
				{965.447,130.395,10.000,0.000},
				{978.341,128.943,10.000,0.000},
				{991.090,127.490,10.000,0.000},
				{1003.694,126.038,10.000,0.000},
				{1016.152,124.585,10.000,0.000},
				{1028.466,123.133,10.000,0.000},
				{1040.634,121.680,10.000,0.000},
				{1052.656,120.228,10.000,0.000},
				{1064.534,118.775,10.000,0.000},
				{1076.266,117.323,10.000,0.000},
				{1087.853,115.870,10.000,0.000},
				{1099.295,114.417,10.000,0.000},
				{1110.591,112.965,10.000,0.000},
				{1121.743,111.512,10.000,0.000},
				{1132.749,110.060,10.000,0.000},
				{1143.609,108.607,10.000,0.000},
				{1154.325,107.155,10.000,0.000},
				{1164.895,105.702,10.000,0.000},
				{1175.320,104.250,10.000,0.000},
				{1185.600,102.797,10.000,0.000},
				{1195.734,101.345,10.000,0.000},
				{1205.723,99.892,10.000,0.000},
				{1215.567,98.440,10.000,0.000},
				{1225.266,96.987,10.000,0.000},
				{1234.819,95.534,10.000,0.000},
				{1244.228,94.082,10.000,0.000},
				{1253.491,92.629,10.000,0.000},
				{1262.608,91.177,10.000,0.000},
				{1271.581,89.724,10.000,0.000},
				{1280.408,88.272,10.000,0.000},
				{1289.090,86.819,10.000,0.000},
				{1297.626,85.367,10.000,0.000},
				{1306.018,83.914,10.000,0.000},
				{1314.264,82.462,10.000,0.000},
				{1322.365,81.009,10.000,0.000},
				{1330.321,79.557,10.000,0.000},
				{1338.131,78.104,10.000,0.000},
				{1345.796,76.651,10.000,0.000},
				{1353.316,75.199,10.000,0.000},
				{1360.691,73.746,10.000,0.000},
				{1367.920,72.294,10.000,0.000},
				{1375.004,70.841,10.000,0.000},
				{1381.943,69.389,10.000,0.000},
				{1388.737,67.936,10.000,0.000},
				{1395.385,66.484,10.000,0.000},
				{1401.888,65.031,10.000,0.000},
				{1408.246,63.579,10.000,0.000},
				{1414.459,62.126,10.000,0.000},
				{1420.526,60.674,10.000,0.000},
				{1426.448,59.221,10.000,0.000},
				{1432.225,57.768,10.000,0.000},
				{1437.857,56.316,10.000,0.000},
				{1443.343,54.863,10.000,0.000},
				{1448.684,53.411,10.000,0.000},
				{1453.880,51.958,10.000,0.000},
				{1458.930,50.506,10.000,0.000},
				{1463.836,49.053,10.000,0.000},
				{1468.596,47.601,10.000,0.000},
				{1473.211,46.148,10.000,0.000},
				{1477.680,44.696,10.000,0.000},
				{1482.004,43.243,10.000,0.000},
				{1486.183,41.790,10.000,0.000},
				{1490.217,40.338,10.000,0.000},
				{1494.106,38.885,10.000,0.000},
				{1497.849,37.433,10.000,0.000},
				{1501.447,35.980,10.000,0.000},
				{1504.900,34.528,10.000,0.000},
				{1508.207,33.075,10.000,0.000},
				{1511.370,31.623,10.000,0.000},
				{1514.387,30.170,10.000,0.000},
				{1517.258,28.718,10.000,0.000},
				{1519.985,27.265,10.000,0.000},
				{1522.566,25.813,10.000,0.000},
				{1525.002,24.360,10.000,0.000},
				{1527.293,22.907,10.000,0.000},
				{1529.438,21.455,10.000,0.000},
				{1531.439,20.002,10.000,0.000},
				{1533.294,18.550,10.000,0.000},
				{1535.003,17.097,10.000,0.000},
				{1536.568,15.645,10.000,0.000},
				{1537.987,14.192,10.000,0.000},
				{1539.261,12.740,10.000,0.000},
				{1540.390,11.287,10.000,0.000},
				{1541.373,9.835,10.000,0.000},
				{1542.211,8.382,10.000,0.000},
				{1542.904,6.930,10.000,0.000},
				{1543.452,5.477,10.000,0.000},
				{1543.855,4.024,10.000,0.000},
				{1544.122,2.678,10.000,0.000},
				{1544.281,1.582,10.000,0.000},
				{1544.358,0.778,10.000,0.000},
				{1544.385,0.263,10.000,0.000},
				{1544.389,0.039,10.000,0.000},
				{1544.389,0.000,10.000,0.000}
		};
		
		double[][] rightPoints = {
				{0.015,0.291,10.000,0.000},
				{0.073,0.581,10.000,0.000},
				{0.203,1.307,10.000,0.000},
				{0.436,2.324,10.000,0.000},
				{0.799,3.631,10.000,0.000},
				{1.307,5.084,10.000,0.000},
				{1.961,6.536,10.000,0.000},
				{2.760,7.989,10.000,0.000},
				{3.704,9.442,10.000,0.000},
				{4.793,10.894,10.000,0.000},
				{6.028,12.347,10.000,0.000},
				{7.408,13.799,10.000,0.000},
				{8.933,15.252,10.000,0.000},
				{10.604,16.704,10.000,0.000},
				{12.419,18.157,10.000,0.000},
				{14.380,19.609,10.000,0.000},
				{16.486,21.062,10.000,0.000},
				{18.738,22.514,10.000,0.000},
				{21.134,23.967,10.000,0.000},
				{23.676,25.419,10.000,0.000},
				{26.364,26.872,10.000,0.000},
				{29.196,28.325,10.000,0.000},
				{32.174,29.777,10.000,0.000},
				{35.297,31.230,10.000,0.000},
				{38.565,32.682,10.000,0.000},
				{41.978,34.135,10.000,0.000},
				{45.537,35.587,10.000,0.000},
				{49.241,37.040,10.000,0.000},
				{53.090,38.492,10.000,0.000},
				{57.085,39.945,10.000,0.000},
				{61.225,41.397,10.000,0.000},
				{65.510,42.850,10.000,0.000},
				{69.940,44.302,10.000,0.000},
				{74.515,45.755,10.000,0.000},
				{79.236,47.208,10.000,0.000},
				{84.102,48.660,10.000,0.000},
				{89.113,50.113,10.000,0.000},
				{94.270,51.565,10.000,0.000},
				{99.572,53.018,10.000,0.000},
				{105.019,54.470,10.000,0.000},
				{110.611,55.923,10.000,0.000},
				{116.348,57.375,10.000,0.000},
				{122.231,58.828,10.000,0.000},
				{128.259,60.280,10.000,0.000},
				{134.433,61.733,10.000,0.000},
				{140.751,63.185,10.000,0.000},
				{147.215,64.638,10.000,0.000},
				{153.824,66.091,10.000,0.000},
				{160.578,67.543,10.000,0.000},
				{167.478,68.996,10.000,0.000},
				{174.523,70.448,10.000,0.000},
				{181.713,71.901,10.000,0.000},
				{189.048,73.353,10.000,0.000},
				{196.529,74.806,10.000,0.000},
				{204.154,76.258,10.000,0.000},
				{211.926,77.711,10.000,0.000},
				{219.842,79.163,10.000,0.000},
				{227.903,80.616,10.000,0.000},
				{236.110,82.068,10.000,0.000},
				{244.462,83.521,10.000,0.000},
				{252.960,84.974,10.000,0.000},
				{261.602,86.426,10.000,0.000},
				{270.390,87.879,10.000,0.000},
				{279.323,89.331,10.000,0.000},
				{288.402,90.784,10.000,0.000},
				{297.625,92.236,10.000,0.000},
				{306.994,93.689,10.000,0.000},
				{316.508,95.141,10.000,0.000},
				{326.168,96.594,10.000,0.000},
				{335.972,98.046,10.000,0.000},
				{345.922,99.499,10.000,0.000},
				{356.017,100.951,10.000,0.000},
				{366.258,102.404,10.000,0.000},
				{376.643,103.857,10.000,0.000},
				{387.174,105.309,10.000,0.000},
				{397.851,106.762,10.000,0.000},
				{408.672,108.214,10.000,0.000},
				{419.639,109.667,10.000,0.000},
				{430.751,111.119,10.000,0.000},
				{442.008,112.572,10.000,0.000},
				{453.410,114.024,10.000,0.000},
				{464.958,115.477,10.000,0.000},
				{476.651,116.929,10.000,0.000},
				{488.489,118.382,10.000,0.000},
				{500.472,119.835,10.000,0.000},
				{512.601,121.287,10.000,0.000},
				{524.875,122.740,10.000,0.000},
				{537.294,124.192,10.000,0.000},
				{549.859,125.645,10.000,0.000},
				{562.569,127.097,10.000,0.000},
				{575.424,128.550,10.000,0.000},
				{588.424,130.002,10.000,0.000},
				{601.569,131.455,10.000,0.000},
				{614.860,132.907,10.000,0.000},
				{628.296,134.360,10.000,0.000},
				{641.877,135.812,10.000,0.000},
				{655.604,137.265,10.000,0.000},
				{669.475,138.718,10.000,0.000},
				{683.492,140.170,10.000,0.000},
				{697.655,141.623,10.000,0.000},
				{711.962,143.075,10.000,0.000},
				{726.400,144.382,10.000,0.000},
				{740.940,145.399,10.000,0.000},
				{755.553,146.125,10.000,0.000},
				{770.209,146.561,10.000,0.000},
				{784.869,146.601,10.000,0.000},
				{799.493,146.243,10.000,0.000},
				{814.053,145.596,10.000,0.000},
				{828.519,144.658,10.000,0.000},
				{842.862,143.429,10.000,0.000},
				{857.063,142.016,10.000,0.000},
				{871.120,140.563,10.000,0.000},
				{885.031,139.111,10.000,0.000},
				{898.796,137.658,10.000,0.000},
				{912.417,136.206,10.000,0.000},
				{925.892,134.753,10.000,0.000},
				{939.222,133.300,10.000,0.000},
				{952.407,131.848,10.000,0.000},
				{965.447,130.395,10.000,0.000},
				{978.341,128.943,10.000,0.000},
				{991.090,127.490,10.000,0.000},
				{1003.694,126.038,10.000,0.000},
				{1016.152,124.585,10.000,0.000},
				{1028.466,123.133,10.000,0.000},
				{1040.634,121.680,10.000,0.000},
				{1052.656,120.228,10.000,0.000},
				{1064.534,118.775,10.000,0.000},
				{1076.266,117.323,10.000,0.000},
				{1087.853,115.870,10.000,0.000},
				{1099.295,114.417,10.000,0.000},
				{1110.591,112.965,10.000,0.000},
				{1121.743,111.512,10.000,0.000},
				{1132.749,110.060,10.000,0.000},
				{1143.609,108.607,10.000,0.000},
				{1154.325,107.155,10.000,0.000},
				{1164.895,105.702,10.000,0.000},
				{1175.320,104.250,10.000,0.000},
				{1185.600,102.797,10.000,0.000},
				{1195.734,101.345,10.000,0.000},
				{1205.723,99.892,10.000,0.000},
				{1215.567,98.440,10.000,0.000},
				{1225.266,96.987,10.000,0.000},
				{1234.819,95.534,10.000,0.000},
				{1244.228,94.082,10.000,0.000},
				{1253.491,92.629,10.000,0.000},
				{1262.608,91.177,10.000,0.000},
				{1271.581,89.724,10.000,0.000},
				{1280.408,88.272,10.000,0.000},
				{1289.090,86.819,10.000,0.000},
				{1297.626,85.367,10.000,0.000},
				{1306.018,83.914,10.000,0.000},
				{1314.264,82.462,10.000,0.000},
				{1322.365,81.009,10.000,0.000},
				{1330.321,79.557,10.000,0.000},
				{1338.131,78.104,10.000,0.000},
				{1345.796,76.651,10.000,0.000},
				{1353.316,75.199,10.000,0.000},
				{1360.691,73.746,10.000,0.000},
				{1367.920,72.294,10.000,0.000},
				{1375.004,70.841,10.000,0.000},
				{1381.943,69.389,10.000,0.000},
				{1388.737,67.936,10.000,0.000},
				{1395.385,66.484,10.000,0.000},
				{1401.888,65.031,10.000,0.000},
				{1408.246,63.579,10.000,0.000},
				{1414.459,62.126,10.000,0.000},
				{1420.526,60.674,10.000,0.000},
				{1426.448,59.221,10.000,0.000},
				{1432.225,57.768,10.000,0.000},
				{1437.857,56.316,10.000,0.000},
				{1443.343,54.863,10.000,0.000},
				{1448.684,53.411,10.000,0.000},
				{1453.880,51.958,10.000,0.000},
				{1458.930,50.506,10.000,0.000},
				{1463.836,49.053,10.000,0.000},
				{1468.596,47.601,10.000,0.000},
				{1473.211,46.148,10.000,0.000},
				{1477.680,44.696,10.000,0.000},
				{1482.004,43.243,10.000,0.000},
				{1486.183,41.790,10.000,0.000},
				{1490.217,40.338,10.000,0.000},
				{1494.106,38.885,10.000,0.000},
				{1497.849,37.433,10.000,0.000},
				{1501.447,35.980,10.000,0.000},
				{1504.900,34.528,10.000,0.000},
				{1508.207,33.075,10.000,0.000},
				{1511.370,31.623,10.000,0.000},
				{1514.387,30.170,10.000,0.000},
				{1517.258,28.718,10.000,0.000},
				{1519.985,27.265,10.000,0.000},
				{1522.566,25.813,10.000,0.000},
				{1525.002,24.360,10.000,0.000},
				{1527.293,22.907,10.000,0.000},
				{1529.438,21.455,10.000,0.000},
				{1531.439,20.002,10.000,0.000},
				{1533.294,18.550,10.000,0.000},
				{1535.003,17.097,10.000,0.000},
				{1536.568,15.645,10.000,0.000},
				{1537.987,14.192,10.000,0.000},
				{1539.261,12.740,10.000,0.000},
				{1540.390,11.287,10.000,0.000},
				{1541.373,9.835,10.000,0.000},
				{1542.211,8.382,10.000,0.000},
				{1542.904,6.930,10.000,0.000},
				{1543.452,5.477,10.000,0.000},
				{1543.855,4.024,10.000,0.000},
				{1544.122,2.678,10.000,0.000},
				{1544.281,1.582,10.000,0.000},
				{1544.358,0.778,10.000,0.000},
				{1544.385,0.263,10.000,0.000},
				{1544.389,0.039,10.000,0.000},
				{1544.389,0.000,10.000,0.000}
		};
		
		if (flipped) {
			rightProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			leftProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		} else {
			leftProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			rightProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		}
	}

}