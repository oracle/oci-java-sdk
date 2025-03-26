/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Pluggable Database Node Level Details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PluggableDatabaseNodeLevelDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PluggableDatabaseNodeLevelDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"nodeName", "openMode"})
    public PluggableDatabaseNodeLevelDetails(String nodeName, OpenMode openMode) {
        super();
        this.nodeName = nodeName;
        this.openMode = openMode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Node name of the Database Instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeName")
        private String nodeName;

        /**
         * The Node name of the Database Instance.
         * @param nodeName the value to set
         * @return this builder
         **/
        public Builder nodeName(String nodeName) {
            this.nodeName = nodeName;
            this.__explicitlySet__.add("nodeName");
            return this;
        }
        /**
         * The mode that pluggable database is in. Open mode can only be changed to READ_ONLY or MIGRATE directly from the backend (within the Oracle Database software).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("openMode")
        private OpenMode openMode;

        /**
         * The mode that pluggable database is in. Open mode can only be changed to READ_ONLY or MIGRATE directly from the backend (within the Oracle Database software).
         *
         * @param openMode the value to set
         * @return this builder
         **/
        public Builder openMode(OpenMode openMode) {
            this.openMode = openMode;
            this.__explicitlySet__.add("openMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PluggableDatabaseNodeLevelDetails build() {
            PluggableDatabaseNodeLevelDetails model =
                    new PluggableDatabaseNodeLevelDetails(this.nodeName, this.openMode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PluggableDatabaseNodeLevelDetails model) {
            if (model.wasPropertyExplicitlySet("nodeName")) {
                this.nodeName(model.getNodeName());
            }
            if (model.wasPropertyExplicitlySet("openMode")) {
                this.openMode(model.getOpenMode());
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
     * The Node name of the Database Instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeName")
    private final String nodeName;

    /**
     * The Node name of the Database Instance.
     * @return the value
     **/
    public String getNodeName() {
        return nodeName;
    }

    /**
     * The mode that pluggable database is in. Open mode can only be changed to READ_ONLY or MIGRATE directly from the backend (within the Oracle Database software).
     *
     **/
    public enum OpenMode {
        ReadOnly("READ_ONLY"),
        ReadWrite("READ_WRITE"),
        Mounted("MOUNTED"),
        Migrate("MIGRATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OpenMode.class);

        private final String value;
        private static java.util.Map<String, OpenMode> map;

        static {
            map = new java.util.HashMap<>();
            for (OpenMode v : OpenMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OpenMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OpenMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OpenMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The mode that pluggable database is in. Open mode can only be changed to READ_ONLY or MIGRATE directly from the backend (within the Oracle Database software).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("openMode")
    private final OpenMode openMode;

    /**
     * The mode that pluggable database is in. Open mode can only be changed to READ_ONLY or MIGRATE directly from the backend (within the Oracle Database software).
     *
     * @return the value
     **/
    public OpenMode getOpenMode() {
        return openMode;
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
        sb.append("PluggableDatabaseNodeLevelDetails(");
        sb.append("super=").append(super.toString());
        sb.append("nodeName=").append(String.valueOf(this.nodeName));
        sb.append(", openMode=").append(String.valueOf(this.openMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PluggableDatabaseNodeLevelDetails)) {
            return false;
        }

        PluggableDatabaseNodeLevelDetails other = (PluggableDatabaseNodeLevelDetails) o;
        return java.util.Objects.equals(this.nodeName, other.nodeName)
                && java.util.Objects.equals(this.openMode, other.openMode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.nodeName == null ? 43 : this.nodeName.hashCode());
        result = (result * PRIME) + (this.openMode == null ? 43 : this.openMode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
