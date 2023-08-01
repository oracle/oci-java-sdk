/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Goal version or image details for the Exadata Fleet Update Cycle. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = FsuGoalVersionDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = VersionFsuTargetDetails.class,
            name = "VERSION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ImageIdFsuTargetDetails.class,
            name = "IMAGE_ID")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class FsuGoalVersionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"homePolicy", "newHomePrefix"})
    protected FsuGoalVersionDetails(HomePolicy homePolicy, String newHomePrefix) {
        super();
        this.homePolicy = homePolicy;
        this.newHomePrefix = newHomePrefix;
    }

    /**
     * Goal home policy to use when Staging the Goal Version during patching. CREATE_NEW: Create a
     * new DBHome (for Database Collections) for the specified image or version. USE_EXISTING: All
     * database targets in the same VMCluster or CloudVmCluster will be moved to a shared database
     * home. If an existing home for the selected image or version is not found in the VM Cluster
     * for a target database, then a new home will be created. If more than one existing home for
     * the selected image is found, then the home with the least number of databases will be used.
     * If multiple homes have the least number of databases, then a home will be selected at random.
     */
    public enum HomePolicy implements com.oracle.bmc.http.internal.BmcEnum {
        CreateNew("CREATE_NEW"),
        UseExisting("USE_EXISTING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(HomePolicy.class);

        private final String value;
        private static java.util.Map<String, HomePolicy> map;

        static {
            map = new java.util.HashMap<>();
            for (HomePolicy v : HomePolicy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        HomePolicy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HomePolicy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'HomePolicy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Goal home policy to use when Staging the Goal Version during patching. CREATE_NEW: Create a
     * new DBHome (for Database Collections) for the specified image or version. USE_EXISTING: All
     * database targets in the same VMCluster or CloudVmCluster will be moved to a shared database
     * home. If an existing home for the selected image or version is not found in the VM Cluster
     * for a target database, then a new home will be created. If more than one existing home for
     * the selected image is found, then the home with the least number of databases will be used.
     * If multiple homes have the least number of databases, then a home will be selected at random.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("homePolicy")
    private final HomePolicy homePolicy;

    /**
     * Goal home policy to use when Staging the Goal Version during patching. CREATE_NEW: Create a
     * new DBHome (for Database Collections) for the specified image or version. USE_EXISTING: All
     * database targets in the same VMCluster or CloudVmCluster will be moved to a shared database
     * home. If an existing home for the selected image or version is not found in the VM Cluster
     * for a target database, then a new home will be created. If more than one existing home for
     * the selected image is found, then the home with the least number of databases will be used.
     * If multiple homes have the least number of databases, then a home will be selected at random.
     *
     * @return the value
     */
    public HomePolicy getHomePolicy() {
        return homePolicy;
    }

    /**
     * Prefix name used for new DB home resources created as part of the Stage Action. Format:
     * <specified_prefix>_<timestamp> If not specified, a default OCI DB home resource will be
     * generated for the new DB home resources created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("newHomePrefix")
    private final String newHomePrefix;

    /**
     * Prefix name used for new DB home resources created as part of the Stage Action. Format:
     * <specified_prefix>_<timestamp> If not specified, a default OCI DB home resource will be
     * generated for the new DB home resources created.
     *
     * @return the value
     */
    public String getNewHomePrefix() {
        return newHomePrefix;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FsuGoalVersionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("homePolicy=").append(String.valueOf(this.homePolicy));
        sb.append(", newHomePrefix=").append(String.valueOf(this.newHomePrefix));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FsuGoalVersionDetails)) {
            return false;
        }

        FsuGoalVersionDetails other = (FsuGoalVersionDetails) o;
        return java.util.Objects.equals(this.homePolicy, other.homePolicy)
                && java.util.Objects.equals(this.newHomePrefix, other.newHomePrefix)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.homePolicy == null ? 43 : this.homePolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.newHomePrefix == null ? 43 : this.newHomePrefix.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Type of goal target version specified */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Version("VERSION"),
        ImageId("IMAGE_ID"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
}
