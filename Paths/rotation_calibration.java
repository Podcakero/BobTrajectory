package org.usfirst.frc.team319.paths;

import org.usfirst.frc.team319.models.SrxMotionProfile;
import org.usfirst.frc.team319.models.SrxTrajectory;

public class rotation_calibration extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (0.00,0.00,0.00)
	// (2.38,0.00,0.00)
	
	public rotation_calibration() {
		this(false);
	}
			
    public rotation_calibration(boolean flipped) {
		super();
		
		if (flipped) {
			rightProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
			leftProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		} else {
			leftProfile = new SrxMotionProfile(leftPoints.length, leftPoints);
			centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
			rightProfile = new SrxMotionProfile(rightPoints.length, rightPoints);
		}
	}

		double[][] leftPoints = {
				{0.014,0.270,10.000,0.000},
				{0.068,0.541,10.000,0.000},
				{0.189,1.217,10.000,0.000},
				{0.406,2.164,10.000,0.000},
				{0.744,3.381,10.000,0.000},
				{1.231,4.868,10.000,0.000},
				{1.893,6.626,10.000,0.000},
				{2.759,8.654,10.000,0.000},
				{3.854,10.953,10.000,0.000},
				{5.193,13.387,10.000,0.000},
				{6.775,15.821,10.000,0.000},
				{8.600,18.255,10.000,0.000},
				{10.669,20.689,10.000,0.000},
				{12.981,23.123,10.000,0.000},
				{15.537,25.557,10.000,0.000},
				{18.336,27.991,10.000,0.000},
				{21.378,30.425,10.000,0.000},
				{24.664,32.859,10.000,0.000},
				{28.194,35.293,10.000,0.000},
				{31.966,37.727,10.000,0.000},
				{35.982,40.161,10.000,0.000},
				{40.242,42.595,10.000,0.000},
				{44.745,45.029,10.000,0.000},
				{49.491,47.463,10.000,0.000},
				{54.481,49.897,10.000,0.000},
				{59.714,52.331,10.000,0.000},
				{65.190,54.765,10.000,0.000},
				{70.910,57.199,10.000,0.000},
				{76.873,59.633,10.000,0.000},
				{83.080,62.067,10.000,0.000},
				{89.530,64.501,10.000,0.000},
				{96.224,66.935,10.000,0.000},
				{103.160,69.369,10.000,0.000},
				{110.341,71.803,10.000,0.000},
				{117.764,74.237,10.000,0.000},
				{125.431,76.671,10.000,0.000},
				{133.342,79.104,10.000,0.000},
				{141.496,81.538,10.000,0.000},
				{149.893,83.972,10.000,0.000},
				{158.534,86.406,10.000,0.000},
				{167.418,88.840,10.000,0.000},
				{176.545,91.274,10.000,0.000},
				{185.916,93.708,10.000,0.000},
				{195.530,96.142,10.000,0.000},
				{205.388,98.576,10.000,0.000},
				{215.489,101.010,10.000,0.000},
				{225.833,103.444,10.000,0.000},
				{236.421,105.878,10.000,0.000},
				{247.252,108.312,10.000,0.000},
				{258.327,110.746,10.000,0.000},
				{269.645,113.180,10.000,0.000},
				{281.206,115.614,10.000,0.000},
				{293.011,118.048,10.000,0.000},
				{305.059,120.482,10.000,0.000},
				{317.351,122.916,10.000,0.000},
				{329.886,125.350,10.000,0.000},
				{342.664,127.784,10.000,0.000},
				{355.686,130.218,10.000,0.000},
				{368.951,132.652,10.000,0.000},
				{382.460,135.086,10.000,0.000},
				{396.212,137.520,10.000,0.000},
				{410.208,139.954,10.000,0.000},
				{424.446,142.388,10.000,0.000},
				{438.929,144.822,10.000,0.000},
				{453.654,147.256,10.000,0.000},
				{468.610,149.555,10.000,0.000},
				{483.768,151.583,10.000,0.000},
				{499.102,153.341,10.000,0.000},
				{514.585,154.828,10.000,0.000},
				{530.189,156.045,10.000,0.000},
				{545.889,156.992,10.000,0.000},
				{561.655,157.668,10.000,0.000},
				{577.463,158.074,10.000,0.000},
				{593.273,158.103,10.000,0.000},
				{609.049,157.754,10.000,0.000},
				{624.762,157.136,10.000,0.000},
				{640.387,156.247,10.000,0.000},
				{655.896,155.087,10.000,0.000},
				{671.261,153.657,10.000,0.000},
				{686.457,151.957,10.000,0.000},
				{701.456,149.986,10.000,0.000},
				{716.230,147.745,10.000,0.000},
				{730.764,145.340,10.000,0.000},
				{745.055,142.906,10.000,0.000},
				{759.102,140.472,10.000,0.000},
				{772.906,138.038,10.000,0.000},
				{786.466,135.604,10.000,0.000},
				{799.783,133.170,10.000,0.000},
				{812.857,130.736,10.000,0.000},
				{825.687,128.302,10.000,0.000},
				{838.274,125.868,10.000,0.000},
				{850.617,123.434,10.000,0.000},
				{862.717,121.000,10.000,0.000},
				{874.574,118.566,10.000,0.000},
				{886.187,116.132,10.000,0.000},
				{897.557,113.698,10.000,0.000},
				{908.683,111.264,10.000,0.000},
				{919.566,108.830,10.000,0.000},
				{930.206,106.396,10.000,0.000},
				{940.602,103.962,10.000,0.000},
				{950.755,101.528,10.000,0.000},
				{960.664,99.094,10.000,0.000},
				{970.330,96.660,10.000,0.000},
				{979.753,94.226,10.000,0.000},
				{988.932,91.792,10.000,0.000},
				{997.868,89.358,10.000,0.000},
				{1006.560,86.924,10.000,0.000},
				{1015.009,84.490,10.000,0.000},
				{1023.215,82.056,10.000,0.000},
				{1031.177,79.622,10.000,0.000},
				{1038.896,77.188,10.000,0.000},
				{1046.371,74.754,10.000,0.000},
				{1053.604,72.320,10.000,0.000},
				{1060.592,69.886,10.000,0.000},
				{1067.337,67.452,10.000,0.000},
				{1073.839,65.018,10.000,0.000},
				{1080.098,62.584,10.000,0.000},
				{1086.113,60.150,10.000,0.000},
				{1091.884,57.716,10.000,0.000},
				{1097.413,55.282,10.000,0.000},
				{1102.697,52.848,10.000,0.000},
				{1107.739,50.415,10.000,0.000},
				{1112.537,47.981,10.000,0.000},
				{1117.092,45.547,10.000,0.000},
				{1121.403,43.113,10.000,0.000},
				{1125.471,40.679,10.000,0.000},
				{1129.295,38.245,10.000,0.000},
				{1132.876,35.811,10.000,0.000},
				{1136.214,33.377,10.000,0.000},
				{1139.308,30.943,10.000,0.000},
				{1142.159,28.509,10.000,0.000},
				{1144.767,26.075,10.000,0.000},
				{1147.131,23.641,10.000,0.000},
				{1149.251,21.207,10.000,0.000},
				{1151.129,18.773,10.000,0.000},
				{1152.762,16.339,10.000,0.000},
				{1154.153,13.905,10.000,0.000},
				{1155.300,11.471,10.000,0.000},
				{1156.214,9.143,10.000,0.000},
				{1156.920,7.057,10.000,0.000},
				{1157.444,5.242,10.000,0.000},
				{1157.814,3.697,10.000,0.000},
				{1158.056,2.422,10.000,0.000},
				{1158.198,1.418,10.000,0.000},
				{1158.266,0.685,10.000,0.000},
				{1158.289,0.222,10.000,0.000},
				{1158.291,0.029,10.000,0.000},
				{1158.291,0.000,10.000,0.000}
		};
		
		double[][] rightPoints = {
				{-0.014,-0.270,10.000,0.000},
				{-0.068,-0.541,10.000,0.000},
				{-0.189,-1.217,10.000,0.000},
				{-0.406,-2.164,10.000,0.000},
				{-0.744,-3.381,10.000,0.000},
				{-1.231,-4.868,10.000,0.000},
				{-1.893,-6.626,10.000,0.000},
				{-2.759,-8.654,10.000,0.000},
				{-3.854,-10.953,10.000,0.000},
				{-5.193,-13.387,10.000,0.000},
				{-6.775,-15.821,10.000,0.000},
				{-8.600,-18.255,10.000,0.000},
				{-10.669,-20.689,10.000,0.000},
				{-12.981,-23.123,10.000,0.000},
				{-15.537,-25.557,10.000,0.000},
				{-18.336,-27.991,10.000,0.000},
				{-21.378,-30.425,10.000,0.000},
				{-24.664,-32.859,10.000,0.000},
				{-28.194,-35.293,10.000,0.000},
				{-31.966,-37.727,10.000,0.000},
				{-35.982,-40.161,10.000,0.000},
				{-40.242,-42.595,10.000,0.000},
				{-44.745,-45.029,10.000,0.000},
				{-49.491,-47.463,10.000,0.000},
				{-54.481,-49.897,10.000,0.000},
				{-59.714,-52.331,10.000,0.000},
				{-65.190,-54.765,10.000,0.000},
				{-70.910,-57.199,10.000,0.000},
				{-76.873,-59.633,10.000,0.000},
				{-83.080,-62.067,10.000,0.000},
				{-89.530,-64.501,10.000,0.000},
				{-96.224,-66.935,10.000,0.000},
				{-103.160,-69.369,10.000,0.000},
				{-110.341,-71.803,10.000,0.000},
				{-117.764,-74.237,10.000,0.000},
				{-125.431,-76.671,10.000,0.000},
				{-133.342,-79.104,10.000,0.000},
				{-141.496,-81.538,10.000,0.000},
				{-149.893,-83.972,10.000,0.000},
				{-158.534,-86.406,10.000,0.000},
				{-167.418,-88.840,10.000,0.000},
				{-176.545,-91.274,10.000,0.000},
				{-185.916,-93.708,10.000,0.000},
				{-195.530,-96.142,10.000,0.000},
				{-205.388,-98.576,10.000,0.000},
				{-215.489,-101.010,10.000,0.000},
				{-225.833,-103.444,10.000,0.000},
				{-236.421,-105.878,10.000,0.000},
				{-247.252,-108.312,10.000,0.000},
				{-258.327,-110.746,10.000,0.000},
				{-269.645,-113.180,10.000,0.000},
				{-281.206,-115.614,10.000,0.000},
				{-293.011,-118.048,10.000,0.000},
				{-305.059,-120.482,10.000,0.000},
				{-317.351,-122.916,10.000,0.000},
				{-329.886,-125.350,10.000,0.000},
				{-342.664,-127.784,10.000,0.000},
				{-355.686,-130.218,10.000,0.000},
				{-368.951,-132.652,10.000,0.000},
				{-382.460,-135.086,10.000,0.000},
				{-396.212,-137.520,10.000,0.000},
				{-410.208,-139.954,10.000,0.000},
				{-424.446,-142.388,10.000,0.000},
				{-438.929,-144.822,10.000,0.000},
				{-453.654,-147.256,10.000,0.000},
				{-468.610,-149.555,10.000,0.000},
				{-483.768,-151.583,10.000,0.000},
				{-499.102,-153.341,10.000,0.000},
				{-514.585,-154.828,10.000,0.000},
				{-530.189,-156.045,10.000,0.000},
				{-545.889,-156.992,10.000,0.000},
				{-561.655,-157.668,10.000,0.000},
				{-577.463,-158.074,10.000,0.000},
				{-593.273,-158.103,10.000,0.000},
				{-609.049,-157.754,10.000,0.000},
				{-624.762,-157.136,10.000,0.000},
				{-640.387,-156.247,10.000,0.000},
				{-655.896,-155.087,10.000,0.000},
				{-671.261,-153.657,10.000,0.000},
				{-686.457,-151.957,10.000,0.000},
				{-701.456,-149.986,10.000,0.000},
				{-716.230,-147.745,10.000,0.000},
				{-730.764,-145.340,10.000,0.000},
				{-745.055,-142.906,10.000,0.000},
				{-759.102,-140.472,10.000,0.000},
				{-772.906,-138.038,10.000,0.000},
				{-786.466,-135.604,10.000,0.000},
				{-799.783,-133.170,10.000,0.000},
				{-812.857,-130.736,10.000,0.000},
				{-825.687,-128.302,10.000,0.000},
				{-838.274,-125.868,10.000,0.000},
				{-850.617,-123.434,10.000,0.000},
				{-862.717,-121.000,10.000,0.000},
				{-874.574,-118.566,10.000,0.000},
				{-886.187,-116.132,10.000,0.000},
				{-897.557,-113.698,10.000,0.000},
				{-908.683,-111.264,10.000,0.000},
				{-919.566,-108.830,10.000,0.000},
				{-930.206,-106.396,10.000,0.000},
				{-940.602,-103.962,10.000,0.000},
				{-950.755,-101.528,10.000,0.000},
				{-960.664,-99.094,10.000,0.000},
				{-970.330,-96.660,10.000,0.000},
				{-979.753,-94.226,10.000,0.000},
				{-988.932,-91.792,10.000,0.000},
				{-997.868,-89.358,10.000,0.000},
				{-1006.560,-86.924,10.000,0.000},
				{-1015.009,-84.490,10.000,0.000},
				{-1023.215,-82.056,10.000,0.000},
				{-1031.177,-79.622,10.000,0.000},
				{-1038.896,-77.188,10.000,0.000},
				{-1046.371,-74.754,10.000,0.000},
				{-1053.604,-72.320,10.000,0.000},
				{-1060.592,-69.886,10.000,0.000},
				{-1067.337,-67.452,10.000,0.000},
				{-1073.839,-65.018,10.000,0.000},
				{-1080.098,-62.584,10.000,0.000},
				{-1086.113,-60.150,10.000,0.000},
				{-1091.884,-57.716,10.000,0.000},
				{-1097.413,-55.282,10.000,0.000},
				{-1102.697,-52.848,10.000,0.000},
				{-1107.739,-50.415,10.000,0.000},
				{-1112.537,-47.981,10.000,0.000},
				{-1117.092,-45.547,10.000,0.000},
				{-1121.403,-43.113,10.000,0.000},
				{-1125.471,-40.679,10.000,0.000},
				{-1129.295,-38.245,10.000,0.000},
				{-1132.876,-35.811,10.000,0.000},
				{-1136.214,-33.377,10.000,0.000},
				{-1139.308,-30.943,10.000,0.000},
				{-1142.159,-28.509,10.000,0.000},
				{-1144.767,-26.075,10.000,0.000},
				{-1147.131,-23.641,10.000,0.000},
				{-1149.251,-21.207,10.000,0.000},
				{-1151.129,-18.773,10.000,0.000},
				{-1152.762,-16.339,10.000,0.000},
				{-1154.153,-13.905,10.000,0.000},
				{-1155.300,-11.471,10.000,0.000},
				{-1156.214,-9.143,10.000,0.000},
				{-1156.920,-7.057,10.000,0.000},
				{-1157.444,-5.242,10.000,0.000},
				{-1157.814,-3.697,10.000,0.000},
				{-1158.056,-2.422,10.000,0.000},
				{-1158.198,-1.418,10.000,0.000},
				{-1158.266,-0.685,10.000,0.000},
				{-1158.289,-0.222,10.000,0.000},
				{-1158.291,-0.029,10.000,0.000},
				{-1158.291,-0.000,10.000,0.000}
		};
		
		double[][] centerPoints = {
				{0.014,0.270,10.000,0.000},
				{0.068,0.541,10.000,0.000},
				{0.189,1.217,10.000,0.000},
				{0.406,2.164,10.000,0.000},
				{0.744,3.381,10.000,0.000},
				{1.231,4.868,10.000,0.000},
				{1.893,6.626,10.000,0.000},
				{2.759,8.654,10.000,0.000},
				{3.854,10.953,10.000,0.000},
				{5.193,13.387,10.000,0.000},
				{6.775,15.821,10.000,0.000},
				{8.600,18.255,10.000,0.000},
				{10.669,20.689,10.000,0.000},
				{12.981,23.123,10.000,0.000},
				{15.537,25.557,10.000,0.000},
				{18.336,27.991,10.000,0.000},
				{21.378,30.425,10.000,0.000},
				{24.664,32.859,10.000,0.000},
				{28.194,35.293,10.000,0.000},
				{31.966,37.727,10.000,0.000},
				{35.982,40.161,10.000,0.000},
				{40.242,42.595,10.000,0.000},
				{44.745,45.029,10.000,0.000},
				{49.491,47.463,10.000,0.000},
				{54.481,49.897,10.000,0.000},
				{59.714,52.331,10.000,0.000},
				{65.190,54.765,10.000,0.000},
				{70.910,57.199,10.000,0.000},
				{76.873,59.633,10.000,0.000},
				{83.080,62.067,10.000,0.000},
				{89.530,64.501,10.000,0.000},
				{96.224,66.935,10.000,0.000},
				{103.160,69.369,10.000,0.000},
				{110.341,71.803,10.000,0.000},
				{117.764,74.237,10.000,0.000},
				{125.431,76.671,10.000,0.000},
				{133.342,79.104,10.000,0.000},
				{141.496,81.538,10.000,0.000},
				{149.893,83.972,10.000,0.000},
				{158.534,86.406,10.000,0.000},
				{167.418,88.840,10.000,0.000},
				{176.545,91.274,10.000,0.000},
				{185.916,93.708,10.000,0.000},
				{195.530,96.142,10.000,0.000},
				{205.388,98.576,10.000,0.000},
				{215.489,101.010,10.000,0.000},
				{225.833,103.444,10.000,0.000},
				{236.421,105.878,10.000,0.000},
				{247.252,108.312,10.000,0.000},
				{258.327,110.746,10.000,0.000},
				{269.645,113.180,10.000,0.000},
				{281.206,115.614,10.000,0.000},
				{293.011,118.048,10.000,0.000},
				{305.059,120.482,10.000,0.000},
				{317.351,122.916,10.000,0.000},
				{329.886,125.350,10.000,0.000},
				{342.664,127.784,10.000,0.000},
				{355.686,130.218,10.000,0.000},
				{368.951,132.652,10.000,0.000},
				{382.460,135.086,10.000,0.000},
				{396.212,137.520,10.000,0.000},
				{410.208,139.954,10.000,0.000},
				{424.446,142.388,10.000,0.000},
				{438.929,144.822,10.000,0.000},
				{453.654,147.256,10.000,0.000},
				{468.610,149.555,10.000,0.000},
				{483.768,151.583,10.000,0.000},
				{499.102,153.341,10.000,0.000},
				{514.585,154.828,10.000,0.000},
				{530.189,156.045,10.000,0.000},
				{545.889,156.992,10.000,0.000},
				{561.655,157.668,10.000,0.000},
				{577.463,158.074,10.000,0.000},
				{593.273,158.103,10.000,0.000},
				{609.049,157.754,10.000,0.000},
				{624.762,157.136,10.000,0.000},
				{640.387,156.247,10.000,0.000},
				{655.896,155.087,10.000,0.000},
				{671.261,153.657,10.000,0.000},
				{686.457,151.957,10.000,0.000},
				{701.456,149.986,10.000,0.000},
				{716.230,147.745,10.000,0.000},
				{730.764,145.340,10.000,0.000},
				{745.055,142.906,10.000,0.000},
				{759.102,140.472,10.000,0.000},
				{772.906,138.038,10.000,0.000},
				{786.466,135.604,10.000,0.000},
				{799.783,133.170,10.000,0.000},
				{812.857,130.736,10.000,0.000},
				{825.687,128.302,10.000,0.000},
				{838.274,125.868,10.000,0.000},
				{850.617,123.434,10.000,0.000},
				{862.717,121.000,10.000,0.000},
				{874.574,118.566,10.000,0.000},
				{886.187,116.132,10.000,0.000},
				{897.557,113.698,10.000,0.000},
				{908.683,111.264,10.000,0.000},
				{919.566,108.830,10.000,0.000},
				{930.206,106.396,10.000,0.000},
				{940.602,103.962,10.000,0.000},
				{950.755,101.528,10.000,0.000},
				{960.664,99.094,10.000,0.000},
				{970.330,96.660,10.000,0.000},
				{979.753,94.226,10.000,0.000},
				{988.932,91.792,10.000,0.000},
				{997.868,89.358,10.000,0.000},
				{1006.560,86.924,10.000,0.000},
				{1015.009,84.490,10.000,0.000},
				{1023.215,82.056,10.000,0.000},
				{1031.177,79.622,10.000,0.000},
				{1038.896,77.188,10.000,0.000},
				{1046.371,74.754,10.000,0.000},
				{1053.604,72.320,10.000,0.000},
				{1060.592,69.886,10.000,0.000},
				{1067.337,67.452,10.000,0.000},
				{1073.839,65.018,10.000,0.000},
				{1080.098,62.584,10.000,0.000},
				{1086.113,60.150,10.000,0.000},
				{1091.884,57.716,10.000,0.000},
				{1097.413,55.282,10.000,0.000},
				{1102.697,52.848,10.000,0.000},
				{1107.739,50.415,10.000,0.000},
				{1112.537,47.981,10.000,0.000},
				{1117.092,45.547,10.000,0.000},
				{1121.403,43.113,10.000,0.000},
				{1125.471,40.679,10.000,0.000},
				{1129.295,38.245,10.000,0.000},
				{1132.876,35.811,10.000,0.000},
				{1136.214,33.377,10.000,0.000},
				{1139.308,30.943,10.000,0.000},
				{1142.159,28.509,10.000,0.000},
				{1144.767,26.075,10.000,0.000},
				{1147.131,23.641,10.000,0.000},
				{1149.251,21.207,10.000,0.000},
				{1151.129,18.773,10.000,0.000},
				{1152.762,16.339,10.000,0.000},
				{1154.153,13.905,10.000,0.000},
				{1155.300,11.471,10.000,0.000},
				{1156.214,9.143,10.000,0.000},
				{1156.920,7.057,10.000,0.000},
				{1157.444,5.242,10.000,0.000},
				{1157.814,3.697,10.000,0.000},
				{1158.056,2.422,10.000,0.000},
				{1158.198,1.418,10.000,0.000},
				{1158.266,0.685,10.000,0.000},
				{1158.289,0.222,10.000,0.000},
				{1158.291,0.029,10.000,0.000},
				{1158.291,0.000,10.000,0.000}		};

}