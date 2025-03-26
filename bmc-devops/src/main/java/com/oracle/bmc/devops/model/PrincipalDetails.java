/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The principal details
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PrincipalDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PrincipalDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "principalId",
        "principalName",
        "principalType",
        "principalState"
    })
    public PrincipalDetails(
            String principalId,
            String principalName,
            PrincipalType principalType,
            PrincipalState principalState) {
        super();
        this.principalId = principalId;
        this.principalName = principalName;
        this.principalType = principalType;
        this.principalState = principalState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * the OCID of the principal
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("principalId")
        private String principalId;

        /**
         * the OCID of the principal
         * @param principalId the value to set
         * @return this builder
         **/
        public Builder principalId(String principalId) {
            this.principalId = principalId;
            this.__explicitlySet__.add("principalId");
            return this;
        }
        /**
         * the name of the principal
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("principalName")
        private String principalName;

        /**
         * the name of the principal
         * @param principalName the value to set
         * @return this builder
         **/
        public Builder principalName(String principalName) {
            this.principalName = principalName;
            this.__explicitlySet__.add("principalName");
            return this;
        }
        /**
         * the type of principal
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("principalType")
        private PrincipalType principalType;

        /**
         * the type of principal
         * @param principalType the value to set
         * @return this builder
         **/
        public Builder principalType(PrincipalType principalType) {
            this.principalType = principalType;
            this.__explicitlySet__.add("principalType");
            return this;
        }
        /**
         * The state of the principal, it can be active or inactive or suppressed for emails
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("principalState")
        private PrincipalState principalState;

        /**
         * The state of the principal, it can be active or inactive or suppressed for emails
         * @param principalState the value to set
         * @return this builder
         **/
        public Builder principalState(PrincipalState principalState) {
            this.principalState = principalState;
            this.__explicitlySet__.add("principalState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PrincipalDetails build() {
            PrincipalDetails model =
                    new PrincipalDetails(
                            this.principalId,
                            this.principalName,
                            this.principalType,
                            this.principalState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrincipalDetails model) {
            if (model.wasPropertyExplicitlySet("principalId")) {
                this.principalId(model.getPrincipalId());
            }
            if (model.wasPropertyExplicitlySet("principalName")) {
                this.principalName(model.getPrincipalName());
            }
            if (model.wasPropertyExplicitlySet("principalType")) {
                this.principalType(model.getPrincipalType());
            }
            if (model.wasPropertyExplicitlySet("principalState")) {
                this.principalState(model.getPrincipalState());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * the OCID of the principal
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("principalId")
    private final String principalId;

    /**
     * the OCID of the principal
     * @return the value
     **/
    public String getPrincipalId() {
        return principalId;
    }

    /**
     * the name of the principal
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("principalName")
    private final String principalName;

    /**
     * the name of the principal
     * @return the value
     **/
    public String getPrincipalName() {
        return principalName;
    }

    /**
     * the type of principal
     **/
    public enum PrincipalType {
        Service("SERVICE"),
        User("USER"),
        Instance("INSTANCE"),
        Resource("RESOURCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PrincipalType.class);

        private final String value;
        private static java.util.Map<String, PrincipalType> map;

        static {
            map = new java.util.HashMap<>();
            for (PrincipalType v : PrincipalType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PrincipalType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PrincipalType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PrincipalType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * the type of principal
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("principalType")
    private final PrincipalType principalType;

    /**
     * the type of principal
     * @return the value
     **/
    public PrincipalType getPrincipalType() {
        return principalType;
    }

    /**
     * The state of the principal, it can be active or inactive or suppressed for emails
     **/
    public enum PrincipalState {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Suppressed("SUPPRESSED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PrincipalState.class);

        private final String value;
        private static java.util.Map<String, PrincipalState> map;

        static {
            map = new java.util.HashMap<>();
            for (PrincipalState v : PrincipalState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PrincipalState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PrincipalState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PrincipalState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The state of the principal, it can be active or inactive or suppressed for emails
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("principalState")
    private final PrincipalState principalState;

    /**
     * The state of the principal, it can be active or inactive or suppressed for emails
     * @return the value
     **/
    public PrincipalState getPrincipalState() {
        return principalState;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PrincipalDetails(");
        sb.append("super=").append(super.toString());
        sb.append("principalId=").append(String.valueOf(this.principalId));
        sb.append(", principalName=").append(String.valueOf(this.principalName));
        sb.append(", principalType=").append(String.valueOf(this.principalType));
        sb.append(", principalState=").append(String.valueOf(this.principalState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrincipalDetails)) {
            return false;
        }

        PrincipalDetails other = (PrincipalDetails) o;
        return java.util.Objects.equals(this.principalId, other.principalId)
                && java.util.Objects.equals(this.principalName, other.principalName)
                && java.util.Objects.equals(this.principalType, other.principalType)
                && java.util.Objects.equals(this.principalState, other.principalState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.principalId == null ? 43 : this.principalId.hashCode());
        result =
                (result * PRIME)
                        + (this.principalName == null ? 43 : this.principalName.hashCode());
        result =
                (result * PRIME)
                        + (this.principalType == null ? 43 : this.principalType.hashCode());
        result =
                (result * PRIME)
                        + (this.principalState == null ? 43 : this.principalState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
