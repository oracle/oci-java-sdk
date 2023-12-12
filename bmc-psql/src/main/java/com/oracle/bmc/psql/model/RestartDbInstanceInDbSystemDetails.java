/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Database instance node restart parameters. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RestartDbInstanceInDbSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RestartDbInstanceInDbSystemDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dbInstanceId", "restartType"})
    public RestartDbInstanceInDbSystemDetails(String dbInstanceId, RestartType restartType) {
        super();
        this.dbInstanceId = dbInstanceId;
        this.restartType = restartType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A unique identifier for the database instance, or node. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbInstanceId")
        private String dbInstanceId;

        /**
         * A unique identifier for the database instance, or node.
         *
         * @param dbInstanceId the value to set
         * @return this builder
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            this.__explicitlySet__.add("dbInstanceId");
            return this;
        }
        /** The restart type for the database instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("restartType")
        private RestartType restartType;

        /**
         * The restart type for the database instance.
         *
         * @param restartType the value to set
         * @return this builder
         */
        public Builder restartType(RestartType restartType) {
            this.restartType = restartType;
            this.__explicitlySet__.add("restartType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RestartDbInstanceInDbSystemDetails build() {
            RestartDbInstanceInDbSystemDetails model =
                    new RestartDbInstanceInDbSystemDetails(this.dbInstanceId, this.restartType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RestartDbInstanceInDbSystemDetails model) {
            if (model.wasPropertyExplicitlySet("dbInstanceId")) {
                this.dbInstanceId(model.getDbInstanceId());
            }
            if (model.wasPropertyExplicitlySet("restartType")) {
                this.restartType(model.getRestartType());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** A unique identifier for the database instance, or node. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbInstanceId")
    private final String dbInstanceId;

    /**
     * A unique identifier for the database instance, or node.
     *
     * @return the value
     */
    public String getDbInstanceId() {
        return dbInstanceId;
    }

    /** The restart type for the database instance. */
    public enum RestartType implements com.oracle.bmc.http.internal.BmcEnum {
        Normal("NORMAL"),
        NodeReboot("NODE_REBOOT"),
        ;

        private final String value;
        private static java.util.Map<String, RestartType> map;

        static {
            map = new java.util.HashMap<>();
            for (RestartType v : RestartType.values()) {
                map.put(v.getValue(), v);
            }
        }

        RestartType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RestartType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid RestartType: " + key);
        }
    };
    /** The restart type for the database instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("restartType")
    private final RestartType restartType;

    /**
     * The restart type for the database instance.
     *
     * @return the value
     */
    public RestartType getRestartType() {
        return restartType;
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
        sb.append("RestartDbInstanceInDbSystemDetails(");
        sb.append("super=").append(super.toString());
        sb.append("dbInstanceId=").append(String.valueOf(this.dbInstanceId));
        sb.append(", restartType=").append(String.valueOf(this.restartType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RestartDbInstanceInDbSystemDetails)) {
            return false;
        }

        RestartDbInstanceInDbSystemDetails other = (RestartDbInstanceInDbSystemDetails) o;
        return java.util.Objects.equals(this.dbInstanceId, other.dbInstanceId)
                && java.util.Objects.equals(this.restartType, other.restartType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dbInstanceId == null ? 43 : this.dbInstanceId.hashCode());
        result = (result * PRIME) + (this.restartType == null ? 43 : this.restartType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
