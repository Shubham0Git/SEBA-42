/*
 * Copyright 2018-present Open Networking Foundation
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
package org.opencord.cordmcast;

import org.onlab.packet.IpAddress;
import org.onlab.packet.VlanId;

import java.util.Optional;
import java.util.HashSet;

public class CordMcastStatistics {

    private HashSet<Optional<IpAddress>> sourceAddress;
    private VlanId vlanId;

    public CordMcastStatistics() {
        vlanId = VlanId.NONE;
        sourceAddress = new HashSet<Optional<IpAddress>>();
    }

    public HashSet<Optional<IpAddress>> getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(HashSet<Optional<IpAddress>> sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public void addSourceAddress(HashSet<Optional<IpAddress>> sourceAddress) {
        this.sourceAddress.addAll(sourceAddress);
    }

    public VlanId getVlanId() {
        return vlanId;
    }

    public void setVlanId(VlanId vlanId) {
        this.vlanId = vlanId;
    }
}
