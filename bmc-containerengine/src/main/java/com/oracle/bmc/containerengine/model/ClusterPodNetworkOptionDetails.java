/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The CNI type and relevant network details potentially applicable to the node pools of the cluster
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "cniType",
    defaultImpl = ClusterPodNetworkOptionDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = FlannelOverlayClusterPodNetworkOptionDetails.class,
        name = "FLANNEL_OVERLAY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = OciVcnIpNativeClusterPodNetworkOptionDetails.class,
        name = "OCI_VCN_IP_NATIVE"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ClusterPodNetworkOptionDetails {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected ClusterPodNetworkOptionDetails() {
        super();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ClusterPodNetworkOptionDetails(");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterPodNetworkOptionDetails)) {
            return false;
        }

        ClusterPodNetworkOptionDetails other = (ClusterPodNetworkOptionDetails) o;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        return result;
    }

    /**
     * The CNI used by the node pools of this cluster
     **/
    public enum CniType {
        OciVcnIpNative("OCI_VCN_IP_NATIVE"),
        FlannelOverlay("FLANNEL_OVERLAY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CniType.class);

        private final String value;
        private static java.util.Map<String, CniType> map;

        static {
            map = new java.util.HashMap<>();
            for (CniType v : CniType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CniType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CniType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CniType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
