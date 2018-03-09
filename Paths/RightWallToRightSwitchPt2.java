package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class RightWallToRightSwitchPt2 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (2.00,-1.00,-30.00)
	
	public RightWallToRightSwitchPt2() {
		this(false);
	}
			
    public RightWallToRightSwitchPt2(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.559,11.189,10.000},
				{2.798,22.383,10.000},
				{7.836,50.386,10.000},
				{16.802,89.660,10.000},
				{30.833,140.310,10.000},
				{51.084,202.512,10.000},
				{78.737,276.521,10.000},
				{115.006,362.694,10.000},
				{161.156,461.499,10.000},
				{218.509,573.533,10.000},
				{288.462,699.529,10.000},
				{372.499,840.370,10.000},
				{472.208,997.094,10.000},
				{589.299,1170.901,10.000},
				{725.004,1357.055,10.000},
				{880.052,1550.485,10.000},
				{1055.246,1751.940,10.000},
				{1251.459,1962.128,10.000},
				{1469.630,2181.707,10.000},
				{1710.759,2411.294,10.000},
				{1975.905,2651.461,10.000},
				{2266.180,2902.742,10.000},
				{2582.743,3165.631,10.000},
				{2926.801,3440.585,10.000},
				{3299.604,3728.025,10.000},
				{3702.438,4028.339,10.000},
				{4136.625,4341.872,10.000},
				{4603.518,4668.932,10.000},
				{5104.495,5009.771,10.000},
				{5640.953,5364.579,10.000},
				{6214.299,5733.464,10.000},
				{6825.942,6116.431,10.000},
				{7477.277,6513.345,10.000},
				{8169.667,6923.899,10.000},
				{8904.423,7347.562,10.000},
				{9682.775,7783.522,10.000},
				{10505.838,8230.624,10.000},
				{11374.567,8687.295,10.000},
				{12289.714,9151.468,10.000},
				{13251.765,9620.505,10.000},
				{14260.877,10091.127,10.000},
				{15316.814,10559.361,10.000},
				{16418.865,11020.512,10.000},
				{17565.783,11469.178,10.000},
				{18755.715,11899.318,10.000},
				{19986.153,12304.382,10.000},
				{21253.904,12677.513,10.000},
				{22555.086,13011.822,10.000},
				{23884.028,13289.424,10.000},
				{25233.380,13493.515,10.000},
				{26595.423,13620.429,10.000},
				{27962.285,13668.625,10.000},
				{29326.166,13638.803,10.000},
				{30679.548,13533.827,10.000},
				{32015.396,13358.479,10.000},
				{33327.303,13119.067,10.000},
				{34609.599,12822.964,10.000},
				{35857.411,12478.120,10.000},
				{37066.674,12092.628,10.000},
				{38234.110,11674.354,10.000},
				{39356.928,11228.185,10.000},
				{40432.271,10753.427,10.000},
				{41458.285,10260.138,10.000},
				{42434.487,9762.025,10.000},
				{43360.840,9263.529,10.000},
				{44237.686,8768.463,10.000},
				{45065.698,8280.115,10.000},
				{45845.832,7801.343,10.000},
				{46579.299,7334.668,10.000},
				{47267.532,6882.327,10.000},
				{47912.164,6446.320,10.000},
				{48515.006,6028.424,10.000},
				{49078.024,5630.179,10.000},
				{49603.311,5252.869,10.000},
				{50093.186,4898.751,10.000},
				{50550.412,4572.265,10.000},
				{50977.966,4275.537,10.000},
				{51378.707,4007.409,10.000},
				{51755.369,3766.621,10.000},
				{52110.549,3551.795,10.000},
				{52446.691,3361.427,10.000},
				{52766.080,3193.885,10.000},
				{53070.821,3047.412,10.000},
				{53362.836,2920.147,10.000},
				{53643.849,2810.137,10.000},
				{53915.386,2715.369,10.000},
				{54178.765,2633.789,10.000},
				{54435.099,2563.337,10.000},
				{54685.296,2501.971,10.000},
				{54930.066,2447.699,10.000},
				{55169.926,2398.598,10.000},
				{55405.210,2352.841,10.000},
				{55636.081,2308.711,10.000},
				{55862.543,2264.622,10.000},
				{56084.456,2219.126,10.000},
				{56301.548,2170.923,10.000},
				{56513.435,2118.870,10.000},
				{56719.633,2061.980,10.000},
				{56919.576,1999.426,10.000},
				{57112.629,1930.538,10.000},
				{57298.110,1854.804,10.000},
				{57475.296,1771.862,10.000},
				{57643.446,1681.496,10.000},
				{57801.809,1583.633,10.000},
				{57949.642,1478.332,10.000},
				{58086.220,1365.778,10.000},
				{58210.847,1246.274,10.000},
				{58322.870,1120.230,10.000},
				{58421.847,989.766,10.000},
				{58507.938,860.914,10.000},
				{58581.774,738.359,10.000},
				{58644.083,623.084,10.000},
				{58695.678,515.953,10.000},
				{58737.448,417.705,10.000},
				{58770.344,328.961,10.000},
				{58795.367,250.222,10.000},
				{58813.555,181.884,10.000},
				{58825.979,124.243,10.000},
				{58833.730,77.510,10.000},
				{58837.913,41.827,10.000},
				{58839.640,17.274,10.000},
				{58840.030,3.894,10.000},
				{58840.030,0.000,10.000}
		};
		
		double[][] rightPoints = {
				{0.559,11.189,10.000},
				{2.797,22.372,10.000},
				{7.828,50.313,10.000},
				{16.764,89.361,10.000},
				{30.705,139.409,10.000},
				{50.733,200.284,10.000},
				{77.906,271.729,10.000},
				{113.245,353.388,10.000},
				{157.724,444.792,10.000},
				{212.259,545.344,10.000},
				{277.690,654.313,10.000},
				{354.771,770.814,10.000},
				{444.152,893.809,10.000},
				{546.362,1022.099,10.000},
				{661.285,1149.230,10.000},
				{788.194,1269.086,10.000},
				{926.285,1380.916,10.000},
				{1074.687,1484.014,10.000},
				{1232.459,1577.721,10.000},
				{1398.601,1661.420,10.000},
				{1572.055,1734.537,10.000},
				{1751.709,1796.542,10.000},
				{1936.403,1846.938,10.000},
				{2124.929,1885.269,10.000},
				{2316.041,1911.114,10.000},
				{2508.449,1924.085,10.000},
				{2700.833,1923.835,10.000},
				{2891.839,1910.059,10.000},
				{3080.089,1882.503,10.000},
				{3264.187,1840.977,10.000},
				{3442.724,1785.372,10.000},
				{3614.292,1715.686,10.000},
				{3777.497,1632.050,10.000},
				{3930.975,1534.773,10.000},
				{4073.413,1424.386,10.000},
				{4203.583,1301.699,10.000},
				{4320.370,1167.869,10.000},
				{4422.817,1024.467,10.000},
				{4510.173,873.560,10.000},
				{4581.952,717.787,10.000},
				{4637.994,560.427,10.000},
				{4678.539,405.452,10.000},
				{4704.295,257.558,10.000},
				{4716.510,122.147,10.000},
				{4717.036,5.265,10.000},
				{4725.691,86.548,10.000},
				{4740.334,146.424,10.000},
				{4757.081,167.475,10.000},
				{4771.381,143.003,10.000},
				{4778.121,67.392,10.000},
				{4784.424,63.030,10.000},
				{4809.403,249.799,10.000},
				{4858.625,492.219,10.000},
				{4937.368,787.423,10.000},
				{5050.430,1130.628,10.000},
				{5201.983,1515.526,10.000},
				{5395.457,1934.742,10.000},
				{5633.490,2380.323,10.000},
				{5917.907,2844.175,10.000},
				{6249.750,3318.431,10.000},
				{6629.230,3794.802,10.000},
				{7055.510,4262.792,10.000},
				{7527.084,4715.742,10.000},
				{8042.197,5151.134,10.000},
				{8598.650,5564.526,10.000},
				{9193.860,5952.107,10.000},
				{9824.919,6310.588,10.000},
				{10488.630,6637.111,10.000},
				{11181.546,6929.157,10.000},
				{11899.995,7184.489,10.000},
				{12640.106,7401.106,10.000},
				{13397.829,7577.234,10.000},
				{14168.962,7711.332,10.000},
				{14949.174,7802.118,10.000},
				{15734.247,7850.735,10.000},
				{16520.641,7863.932,10.000},
				{17305.378,7847.370,10.000},
				{18085.599,7802.210,10.000},
				{18858.570,7729.711,10.000},
				{19621.695,7631.250,10.000},
				{20372.528,7508.332,10.000},
				{21108.787,7362.590,10.000},
				{21828.365,7195.778,10.000},
				{22529.341,7009.759,10.000},
				{23209.989,6806.485,10.000},
				{23868.786,6587.970,10.000},
				{24504.413,6356.267,10.000},
				{25115.756,6113.436,10.000},
				{25701.908,5861.518,10.000},
				{26262.159,5602.507,10.000},
				{26795.991,5338.324,10.000},
				{27303.071,5070.798,10.000},
				{27783.235,4801.643,10.000},
				{28236.480,4532.449,10.000},
				{28662.946,4264.661,10.000},
				{29062.904,3999.579,10.000},
				{29436.739,3738.347,10.000},
				{29784.934,3481.952,10.000},
				{30108.056,3231.221,10.000},
				{30406.739,2986.823,10.000},
				{30681.666,2749.272,10.000},
				{30933.559,2518.929,10.000},
				{31163.160,2296.009,10.000},
				{31371.218,2080.587,10.000},
				{31558.478,1872.602,10.000},
				{31725.665,1671.870,10.000},
				{31873.474,1478.088,10.000},
				{32002.559,1290.847,10.000},
				{32113.702,1111.426,10.000},
				{32208.200,944.982,10.000},
				{32287.662,794.618,10.000},
				{32353.597,659.352,10.000},
				{32407.429,538.319,10.000},
				{32450.507,430.781,10.000},
				{32484.118,336.116,10.000},
				{32509.501,253.824,10.000},
				{32527.852,183.509,10.000},
				{32540.339,124.874,10.000},
				{32548.110,77.708,10.000},
				{32552.297,41.871,10.000},
				{32554.025,17.280,10.000},
				{32554.414,3.894,10.000},
				{32554.414,0.000,10.000}
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