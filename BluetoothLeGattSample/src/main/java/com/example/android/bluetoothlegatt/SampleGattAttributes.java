/*
 * Copyright (C) 2013 The Android Open Source Project
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

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    public static String FAN_CONTROL_SERVICE_UUID = "86c86302-fc10-1399-df43-fceb24618252";
    public static String FAN_OPERATING_STATE = "705d627b-53e7-eda2-2649-5ecbd0bbfb85";

    static {
        // Sample Services.
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        attributes.put("72f3d37d-c861-07ab-0341-f8cf302ca8b1", "DarkBlue Managed Service");
        attributes.put("f23844d8-1f57-448b-7f44-e64ae0fe15cf", "Line Cook Steps Service");
        //attributes.put("2cc0849e-5378-3abd-8e44-94d6fca2ed39", "Line Cook Steps Service");
        attributes.put("430f9940-1ff5-ca8e-d843-27c7153258a4", "Line Cook 2.0 Steps Service");
        attributes.put(FAN_CONTROL_SERVICE_UUID, "Fan Control Service");


        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        attributes.put("abcbe138-a00c-6b8e-7d44-4b63a80170c3", "DarkBlue Company UUID Characteristic");
        attributes.put("26b8a2dc-544d-008e-c343-5d8fac910c6e", "DarkBlue Major ID Characteristic");
        attributes.put("0acea172-2a76-69a7-4e49-302ed371f6a8", "DarkBlue Minor ID Characteristic");
        attributes.put("e205929f-e016-ecbc-024b-62f0658fdacd", "DarkBlue Measured Power Characteristic");
        attributes.put("519fc39c-9a18-82b2-ea43-6a101ab1a8f9", "Cooking Step Characteristic");
        attributes.put("52812a3d-247d-77b9-6740-75748c4621c5", "Cooking Step Characteristic");
        attributes.put("f47e47ab-b25f-3a83-7b47-1f230b2b1a61", "Cooking Step Characteristic");
        attributes.put(FAN_OPERATING_STATE, "Fan Operating State Characteristic");

    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
