package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class SameSideScalePart4 extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (0.97,0.00,0.00)
	
	public SameSideScalePart4() {
		this(false);
	}
			
    public SameSideScalePart4(boolean flipped) {
		super();
		
		double[][] leftPoints = {
				{0.013,0.265,10.000,0.000},
				{0.066,0.530,10.000,0.000},
				{0.185,1.192,10.000,0.000},
				{0.397,2.118,10.000,0.000},
				{0.728,3.310,10.000,0.000},
				{1.205,4.766,10.000,0.000},
				{1.854,6.488,10.000,0.000},
				{2.701,8.474,10.000,0.000},
				{3.773,10.725,10.000,0.000},
				{5.084,13.108,10.000,0.000},
				{6.633,15.491,10.000,0.000},
				{8.421,17.874,10.000,0.000},
				{10.447,20.258,10.000,0.000},
				{12.711,22.641,10.000,0.000},
				{15.213,25.024,10.000,0.000},
				{17.954,27.407,10.000,0.000},
				{20.933,29.790,10.000,0.000},
				{24.150,32.174,10.000,0.000},
				{27.606,34.557,10.000,0.000},
				{31.300,36.940,10.000,0.000},
				{35.232,39.323,10.000,0.000},
				{39.403,41.707,10.000,0.000},
				{43.812,44.090,10.000,0.000},
				{48.459,46.473,10.000,0.000},
				{53.345,48.856,10.000,0.000},
				{58.469,51.240,10.000,0.000},
				{63.831,53.623,10.000,0.000},
				{69.432,56.006,10.000,0.000},
				{75.271,58.389,10.000,0.000},
				{81.348,60.773,10.000,0.000},
				{87.663,63.156,10.000,0.000},
				{94.217,65.539,10.000,0.000},
				{101.010,67.922,10.000,0.000},
				{108.040,70.306,10.000,0.000},
				{115.309,72.689,10.000,0.000},
				{122.816,75.072,10.000,0.000},
				{130.562,77.455,10.000,0.000},
				{138.546,79.838,10.000,0.000},
				{146.768,82.222,10.000,0.000},
				{155.228,84.605,10.000,0.000},
				{163.927,86.988,10.000,0.000},
				{172.851,89.239,10.000,0.000},
				{181.973,91.225,10.000,0.000},
				{191.268,92.946,10.000,0.000},
				{200.708,94.403,10.000,0.000},
				{210.268,95.594,10.000,0.000},
				{219.920,96.521,10.000,0.000},
				{229.638,97.183,10.000,0.000},
				{239.388,97.501,10.000,0.000},
				{249.123,97.344,10.000,0.000},
				{258.802,96.789,10.000,0.000},
				{268.398,95.969,10.000,0.000},
				{277.887,94.884,10.000,0.000},
				{287.240,93.535,10.000,0.000},
				{296.432,91.920,10.000,0.000},
				{305.436,90.041,10.000,0.000},
				{314.226,87.898,10.000,0.000},
				{322.783,85.568,10.000,0.000},
				{331.101,83.185,10.000,0.000},
				{339.182,80.801,10.000,0.000},
				{347.023,78.418,10.000,0.000},
				{354.627,76.035,10.000,0.000},
				{361.992,73.652,10.000,0.000},
				{369.119,71.268,10.000,0.000},
				{376.007,68.885,10.000,0.000},
				{382.658,66.502,10.000,0.000},
				{389.069,64.119,10.000,0.000},
				{395.243,61.735,10.000,0.000},
				{401.178,59.352,10.000,0.000},
				{406.875,56.969,10.000,0.000},
				{412.334,54.586,10.000,0.000},
				{417.554,52.203,10.000,0.000},
				{422.536,49.819,10.000,0.000},
				{427.280,47.436,10.000,0.000},
				{431.785,45.053,10.000,0.000},
				{436.052,42.670,10.000,0.000},
				{440.080,40.286,10.000,0.000},
				{443.871,37.903,10.000,0.000},
				{447.423,35.520,10.000,0.000},
				{450.736,33.137,10.000,0.000},
				{453.812,30.753,10.000,0.000},
				{456.649,28.370,10.000,0.000},
				{459.247,25.987,10.000,0.000},
				{461.608,23.604,10.000,0.000},
				{463.730,21.220,10.000,0.000},
				{465.613,18.837,10.000,0.000},
				{467.259,16.454,10.000,0.000},
				{468.666,14.071,10.000,0.000},
				{469.835,11.687,10.000,0.000},
				{470.773,9.383,10.000,0.000},
				{471.502,7.290,10.000,0.000},
				{472.048,5.462,10.000,0.000},
				{472.438,3.898,10.000,0.000},
				{472.698,2.600,10.000,0.000},
				{472.855,1.566,10.000,0.000},
				{472.934,0.797,10.000,0.000},
				{472.964,0.293,10.000,0.000},
				{472.969,0.053,10.000,0.000},
				{472.969,0.000,10.000,0.000}
		};
		
		double[][] rightPoints = {
				{-0.013,-0.265,10.000,0.000},
				{-0.066,-0.530,10.000,0.000},
				{-0.185,-1.192,10.000,0.000},
				{-0.397,-2.118,10.000,0.000},
				{-0.728,-3.310,10.000,0.000},
				{-1.205,-4.766,10.000,0.000},
				{-1.854,-6.488,10.000,0.000},
				{-2.701,-8.474,10.000,0.000},
				{-3.773,-10.725,10.000,0.000},
				{-5.084,-13.108,10.000,0.000},
				{-6.633,-15.491,10.000,0.000},
				{-8.421,-17.874,10.000,0.000},
				{-10.447,-20.258,10.000,0.000},
				{-12.711,-22.641,10.000,0.000},
				{-15.213,-25.024,10.000,0.000},
				{-17.954,-27.407,10.000,0.000},
				{-20.933,-29.790,10.000,0.000},
				{-24.150,-32.174,10.000,0.000},
				{-27.606,-34.557,10.000,0.000},
				{-31.300,-36.940,10.000,0.000},
				{-35.232,-39.323,10.000,0.000},
				{-39.403,-41.707,10.000,0.000},
				{-43.812,-44.090,10.000,0.000},
				{-48.459,-46.473,10.000,0.000},
				{-53.345,-48.856,10.000,0.000},
				{-58.469,-51.240,10.000,0.000},
				{-63.831,-53.623,10.000,0.000},
				{-69.432,-56.006,10.000,0.000},
				{-75.271,-58.389,10.000,0.000},
				{-81.348,-60.773,10.000,0.000},
				{-87.663,-63.156,10.000,0.000},
				{-94.217,-65.539,10.000,0.000},
				{-101.010,-67.922,10.000,0.000},
				{-108.040,-70.306,10.000,0.000},
				{-115.309,-72.689,10.000,0.000},
				{-122.816,-75.072,10.000,0.000},
				{-130.562,-77.455,10.000,0.000},
				{-138.546,-79.838,10.000,0.000},
				{-146.768,-82.222,10.000,0.000},
				{-155.228,-84.605,10.000,0.000},
				{-163.927,-86.988,10.000,0.000},
				{-172.851,-89.239,10.000,0.000},
				{-181.973,-91.225,10.000,0.000},
				{-191.268,-92.946,10.000,0.000},
				{-200.708,-94.403,10.000,0.000},
				{-210.268,-95.594,10.000,0.000},
				{-219.920,-96.521,10.000,0.000},
				{-229.638,-97.183,10.000,0.000},
				{-239.388,-97.501,10.000,0.000},
				{-249.123,-97.344,10.000,0.000},
				{-258.802,-96.789,10.000,0.000},
				{-268.398,-95.969,10.000,0.000},
				{-277.887,-94.884,10.000,0.000},
				{-287.240,-93.535,10.000,0.000},
				{-296.432,-91.920,10.000,0.000},
				{-305.436,-90.041,10.000,0.000},
				{-314.226,-87.898,10.000,0.000},
				{-322.783,-85.568,10.000,0.000},
				{-331.101,-83.185,10.000,0.000},
				{-339.182,-80.801,10.000,0.000},
				{-347.023,-78.418,10.000,0.000},
				{-354.627,-76.035,10.000,0.000},
				{-361.992,-73.652,10.000,0.000},
				{-369.119,-71.268,10.000,0.000},
				{-376.007,-68.885,10.000,0.000},
				{-382.658,-66.502,10.000,0.000},
				{-389.069,-64.119,10.000,0.000},
				{-395.243,-61.735,10.000,0.000},
				{-401.178,-59.352,10.000,0.000},
				{-406.875,-56.969,10.000,0.000},
				{-412.334,-54.586,10.000,0.000},
				{-417.554,-52.203,10.000,0.000},
				{-422.536,-49.819,10.000,0.000},
				{-427.280,-47.436,10.000,0.000},
				{-431.785,-45.053,10.000,0.000},
				{-436.052,-42.670,10.000,0.000},
				{-440.080,-40.286,10.000,0.000},
				{-443.871,-37.903,10.000,0.000},
				{-447.423,-35.520,10.000,0.000},
				{-450.736,-33.137,10.000,0.000},
				{-453.812,-30.753,10.000,0.000},
				{-456.649,-28.370,10.000,0.000},
				{-459.247,-25.987,10.000,0.000},
				{-461.608,-23.604,10.000,0.000},
				{-463.730,-21.220,10.000,0.000},
				{-465.613,-18.837,10.000,0.000},
				{-467.259,-16.454,10.000,0.000},
				{-468.666,-14.071,10.000,0.000},
				{-469.835,-11.687,10.000,0.000},
				{-470.773,-9.383,10.000,0.000},
				{-471.502,-7.290,10.000,0.000},
				{-472.048,-5.462,10.000,0.000},
				{-472.438,-3.898,10.000,0.000},
				{-472.698,-2.600,10.000,0.000},
				{-472.855,-1.566,10.000,0.000},
				{-472.934,-0.797,10.000,0.000},
				{-472.964,-0.293,10.000,0.000},
				{-472.969,-0.053,10.000,0.000},
				{-472.969,-0.000,10.000,0.000}
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