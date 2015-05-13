/*
 * Copyright 2015 Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.virtualbng;

import org.onlab.packet.IpAddress;
import org.onlab.packet.MacAddress;

/**
 * Provides information about the virtual BNG configuration.
 */
public interface VbngConfigurationService {

    /**
     * Gets the IP address configured for the next hop.
     *
     * @return the IP address of next hop
     */
    IpAddress getNextHopIpAddress();

    /**
     * Gets the MAC address configured for all the public IP addresses.
     *
     * @return the MAC address
     */
    MacAddress getPublicFacingMac();

    /**
     * Evaluates whether an IP address is an assigned public IP address.
     *
     * @param ipAddress the IP address to evaluate
     * @return true if the input IP address is an assigned public IP address,
     *         otherwise false
     */
    boolean isAssignedPublicIpAddress(IpAddress ipAddress);

    /**
     * Gets an available public IP address from local public IP prefixes.
     *
     * @param privateIpAddress a private IP address
     * @return an available public IP address if it exists, otherwise null
     */
    IpAddress getAvailablePublicIpAddress(IpAddress privateIpAddress);

    /**
     * Gets the public IP address already assigned for a private IP address.
     *
     * @param privateIpAddress a private IP address
     * @return the assigned public IP address if it exists, otherwise null
     */
    IpAddress getAssignedPublicIpAddress(IpAddress privateIpAddress);
}
