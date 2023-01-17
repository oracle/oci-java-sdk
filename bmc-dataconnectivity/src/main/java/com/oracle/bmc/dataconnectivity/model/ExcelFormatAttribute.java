/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The Excel format attribute.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExcelFormatAttribute.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExcelFormatAttribute extends AbstractFormatAttribute {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Range of the data. For example, "'My Sheet'!B3:C35"
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataAddress")
        private String dataAddress;

        /**
         * Range of the data. For example, "'My Sheet'!B3:C35"
         * @param dataAddress the value to set
         * @return this builder
         **/
        public Builder dataAddress(String dataAddress) {
            this.dataAddress = dataAddress;
            this.__explicitlySet__.add("dataAddress");
            return this;
        }
        /**
         * Whether the dataAddress contains the header with column names. If false - column names fill be generated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("header")
        private Boolean header;

        /**
         * Whether the dataAddress contains the header with column names. If false - column names fill be generated.
         * @param header the value to set
         * @return this builder
         **/
        public Builder header(Boolean header) {
            this.header = header;
            this.__explicitlySet__.add("header");
            return this;
        }
        /**
         * Workbook password if it is password protected.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * Workbook password if it is password protected.
         * @param password the value to set
         * @return this builder
         **/
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExcelFormatAttribute build() {
            ExcelFormatAttribute model =
                    new ExcelFormatAttribute(this.dataAddress, this.header, this.password);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExcelFormatAttribute model) {
            if (model.wasPropertyExplicitlySet("dataAddress")) {
                this.dataAddress(model.getDataAddress());
            }
            if (model.wasPropertyExplicitlySet("header")) {
                this.header(model.getHeader());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
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

    @Deprecated
    public ExcelFormatAttribute(String dataAddress, Boolean header, String password) {
        super();
        this.dataAddress = dataAddress;
        this.header = header;
        this.password = password;
    }

    /**
     * Range of the data. For example, "'My Sheet'!B3:C35"
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataAddress")
    private final String dataAddress;

    /**
     * Range of the data. For example, "'My Sheet'!B3:C35"
     * @return the value
     **/
    public String getDataAddress() {
        return dataAddress;
    }

    /**
     * Whether the dataAddress contains the header with column names. If false - column names fill be generated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("header")
    private final Boolean header;

    /**
     * Whether the dataAddress contains the header with column names. If false - column names fill be generated.
     * @return the value
     **/
    public Boolean getHeader() {
        return header;
    }

    /**
     * Workbook password if it is password protected.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * Workbook password if it is password protected.
     * @return the value
     **/
    public String getPassword() {
        return password;
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
        sb.append("ExcelFormatAttribute(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dataAddress=").append(String.valueOf(this.dataAddress));
        sb.append(", header=").append(String.valueOf(this.header));
        sb.append(", password=").append(String.valueOf(this.password));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExcelFormatAttribute)) {
            return false;
        }

        ExcelFormatAttribute other = (ExcelFormatAttribute) o;
        return java.util.Objects.equals(this.dataAddress, other.dataAddress)
                && java.util.Objects.equals(this.header, other.header)
                && java.util.Objects.equals(this.password, other.password)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dataAddress == null ? 43 : this.dataAddress.hashCode());
        result = (result * PRIME) + (this.header == null ? 43 : this.header.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        return result;
    }
}
