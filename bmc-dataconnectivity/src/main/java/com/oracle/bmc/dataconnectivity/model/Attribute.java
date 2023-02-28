/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The attribute object fo the registry that can be used to get the connector details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Attribute.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Attribute extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "isSensitive",
        "isMandatory",
        "isGenerated",
        "isBase64Encoded",
        "validKeyList",
        "attributeType"
    })
    public Attribute(
            String name,
            Boolean isSensitive,
            Boolean isMandatory,
            Boolean isGenerated,
            Boolean isBase64Encoded,
            java.util.List<String> validKeyList,
            String attributeType) {
        super();
        this.name = name;
        this.isSensitive = isSensitive;
        this.isMandatory = isMandatory;
        this.isGenerated = isGenerated;
        this.isBase64Encoded = isBase64Encoded;
        this.validKeyList = validKeyList;
        this.attributeType = attributeType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of of the attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of of the attribute.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** True if attribute is sensitive. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSensitive")
        private Boolean isSensitive;

        /**
         * True if attribute is sensitive.
         *
         * @param isSensitive the value to set
         * @return this builder
         */
        public Builder isSensitive(Boolean isSensitive) {
            this.isSensitive = isSensitive;
            this.__explicitlySet__.add("isSensitive");
            return this;
        }
        /** True if attribute is mandatory. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMandatory")
        private Boolean isMandatory;

        /**
         * True if attribute is mandatory.
         *
         * @param isMandatory the value to set
         * @return this builder
         */
        public Builder isMandatory(Boolean isMandatory) {
            this.isMandatory = isMandatory;
            this.__explicitlySet__.add("isMandatory");
            return this;
        }
        /** True if attribute is generated. */
        @com.fasterxml.jackson.annotation.JsonProperty("isGenerated")
        private Boolean isGenerated;

        /**
         * True if attribute is generated.
         *
         * @param isGenerated the value to set
         * @return this builder
         */
        public Builder isGenerated(Boolean isGenerated) {
            this.isGenerated = isGenerated;
            this.__explicitlySet__.add("isGenerated");
            return this;
        }
        /** True if attribute is encoded. */
        @com.fasterxml.jackson.annotation.JsonProperty("isBase64Encoded")
        private Boolean isBase64Encoded;

        /**
         * True if attribute is encoded.
         *
         * @param isBase64Encoded the value to set
         * @return this builder
         */
        public Builder isBase64Encoded(Boolean isBase64Encoded) {
            this.isBase64Encoded = isBase64Encoded;
            this.__explicitlySet__.add("isBase64Encoded");
            return this;
        }
        /** The list of valid keys. */
        @com.fasterxml.jackson.annotation.JsonProperty("validKeyList")
        private java.util.List<String> validKeyList;

        /**
         * The list of valid keys.
         *
         * @param validKeyList the value to set
         * @return this builder
         */
        public Builder validKeyList(java.util.List<String> validKeyList) {
            this.validKeyList = validKeyList;
            this.__explicitlySet__.add("validKeyList");
            return this;
        }
        /** The attribute type details. */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeType")
        private String attributeType;

        /**
         * The attribute type details.
         *
         * @param attributeType the value to set
         * @return this builder
         */
        public Builder attributeType(String attributeType) {
            this.attributeType = attributeType;
            this.__explicitlySet__.add("attributeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Attribute build() {
            Attribute model =
                    new Attribute(
                            this.name,
                            this.isSensitive,
                            this.isMandatory,
                            this.isGenerated,
                            this.isBase64Encoded,
                            this.validKeyList,
                            this.attributeType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Attribute model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("isSensitive")) {
                this.isSensitive(model.getIsSensitive());
            }
            if (model.wasPropertyExplicitlySet("isMandatory")) {
                this.isMandatory(model.getIsMandatory());
            }
            if (model.wasPropertyExplicitlySet("isGenerated")) {
                this.isGenerated(model.getIsGenerated());
            }
            if (model.wasPropertyExplicitlySet("isBase64Encoded")) {
                this.isBase64Encoded(model.getIsBase64Encoded());
            }
            if (model.wasPropertyExplicitlySet("validKeyList")) {
                this.validKeyList(model.getValidKeyList());
            }
            if (model.wasPropertyExplicitlySet("attributeType")) {
                this.attributeType(model.getAttributeType());
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

    /** The name of of the attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of of the attribute.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** True if attribute is sensitive. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSensitive")
    private final Boolean isSensitive;

    /**
     * True if attribute is sensitive.
     *
     * @return the value
     */
    public Boolean getIsSensitive() {
        return isSensitive;
    }

    /** True if attribute is mandatory. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMandatory")
    private final Boolean isMandatory;

    /**
     * True if attribute is mandatory.
     *
     * @return the value
     */
    public Boolean getIsMandatory() {
        return isMandatory;
    }

    /** True if attribute is generated. */
    @com.fasterxml.jackson.annotation.JsonProperty("isGenerated")
    private final Boolean isGenerated;

    /**
     * True if attribute is generated.
     *
     * @return the value
     */
    public Boolean getIsGenerated() {
        return isGenerated;
    }

    /** True if attribute is encoded. */
    @com.fasterxml.jackson.annotation.JsonProperty("isBase64Encoded")
    private final Boolean isBase64Encoded;

    /**
     * True if attribute is encoded.
     *
     * @return the value
     */
    public Boolean getIsBase64Encoded() {
        return isBase64Encoded;
    }

    /** The list of valid keys. */
    @com.fasterxml.jackson.annotation.JsonProperty("validKeyList")
    private final java.util.List<String> validKeyList;

    /**
     * The list of valid keys.
     *
     * @return the value
     */
    public java.util.List<String> getValidKeyList() {
        return validKeyList;
    }

    /** The attribute type details. */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeType")
    private final String attributeType;

    /**
     * The attribute type details.
     *
     * @return the value
     */
    public String getAttributeType() {
        return attributeType;
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
        sb.append("Attribute(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", isSensitive=").append(String.valueOf(this.isSensitive));
        sb.append(", isMandatory=").append(String.valueOf(this.isMandatory));
        sb.append(", isGenerated=").append(String.valueOf(this.isGenerated));
        sb.append(", isBase64Encoded=").append(String.valueOf(this.isBase64Encoded));
        sb.append(", validKeyList=").append(String.valueOf(this.validKeyList));
        sb.append(", attributeType=").append(String.valueOf(this.attributeType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Attribute)) {
            return false;
        }

        Attribute other = (Attribute) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.isSensitive, other.isSensitive)
                && java.util.Objects.equals(this.isMandatory, other.isMandatory)
                && java.util.Objects.equals(this.isGenerated, other.isGenerated)
                && java.util.Objects.equals(this.isBase64Encoded, other.isBase64Encoded)
                && java.util.Objects.equals(this.validKeyList, other.validKeyList)
                && java.util.Objects.equals(this.attributeType, other.attributeType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.isSensitive == null ? 43 : this.isSensitive.hashCode());
        result = (result * PRIME) + (this.isMandatory == null ? 43 : this.isMandatory.hashCode());
        result = (result * PRIME) + (this.isGenerated == null ? 43 : this.isGenerated.hashCode());
        result =
                (result * PRIME)
                        + (this.isBase64Encoded == null ? 43 : this.isBase64Encoded.hashCode());
        result = (result * PRIME) + (this.validKeyList == null ? 43 : this.validKeyList.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeType == null ? 43 : this.attributeType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
