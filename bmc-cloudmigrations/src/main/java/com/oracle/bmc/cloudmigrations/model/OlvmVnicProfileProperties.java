/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * OLVM Vnic Profile properties.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OlvmVnicProfileProperties.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OlvmVnicProfileProperties
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "comment",
        "customProperties",
        "description",
        "isMigratable",
        "vnicProfileName",
        "passThrough",
        "isPortMirroring"
    })
    public OlvmVnicProfileProperties(
            String comment,
            java.util.List<OlvmCustomProperty> customProperties,
            String description,
            Boolean isMigratable,
            String vnicProfileName,
            PassThrough passThrough,
            Boolean isPortMirroring) {
        super();
        this.comment = comment;
        this.customProperties = customProperties;
        this.description = description;
        this.isMigratable = isMigratable;
        this.vnicProfileName = vnicProfileName;
        this.passThrough = passThrough;
        this.isPortMirroring = isPortMirroring;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Free text containing comments about this object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("comment")
        private String comment;

        /**
         * Free text containing comments about this object.
         * @param comment the value to set
         * @return this builder
         **/
        public Builder comment(String comment) {
            this.comment = comment;
            this.__explicitlySet__.add("comment");
            return this;
        }
        /**
         * Custom properties applied to the vNIC profile.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customProperties")
        private java.util.List<OlvmCustomProperty> customProperties;

        /**
         * Custom properties applied to the vNIC profile.
         * @param customProperties the value to set
         * @return this builder
         **/
        public Builder customProperties(java.util.List<OlvmCustomProperty> customProperties) {
            this.customProperties = customProperties;
            this.__explicitlySet__.add("customProperties");
            return this;
        }
        /**
         * A human-readable description in plain text.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A human-readable description in plain text.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Indicates whether passThrough NIC is migratable or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isMigratable")
        private Boolean isMigratable;

        /**
         * Indicates whether passThrough NIC is migratable or not.
         * @param isMigratable the value to set
         * @return this builder
         **/
        public Builder isMigratable(Boolean isMigratable) {
            this.isMigratable = isMigratable;
            this.__explicitlySet__.add("isMigratable");
            return this;
        }
        /**
         * A human-readable name in plain text
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vnicProfileName")
        private String vnicProfileName;

        /**
         * A human-readable name in plain text
         * @param vnicProfileName the value to set
         * @return this builder
         **/
        public Builder vnicProfileName(String vnicProfileName) {
            this.vnicProfileName = vnicProfileName;
            this.__explicitlySet__.add("vnicProfileName");
            return this;
        }
        /**
         * Describes whether the vNIC is to be implemented as a pass-through device or a virtual one.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("passThrough")
        private PassThrough passThrough;

        /**
         * Describes whether the vNIC is to be implemented as a pass-through device or a virtual one.
         * @param passThrough the value to set
         * @return this builder
         **/
        public Builder passThrough(PassThrough passThrough) {
            this.passThrough = passThrough;
            this.__explicitlySet__.add("passThrough");
            return this;
        }
        /**
         * Indicates if port mirroring is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPortMirroring")
        private Boolean isPortMirroring;

        /**
         * Indicates if port mirroring is enabled.
         * @param isPortMirroring the value to set
         * @return this builder
         **/
        public Builder isPortMirroring(Boolean isPortMirroring) {
            this.isPortMirroring = isPortMirroring;
            this.__explicitlySet__.add("isPortMirroring");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmVnicProfileProperties build() {
            OlvmVnicProfileProperties model =
                    new OlvmVnicProfileProperties(
                            this.comment,
                            this.customProperties,
                            this.description,
                            this.isMigratable,
                            this.vnicProfileName,
                            this.passThrough,
                            this.isPortMirroring);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmVnicProfileProperties model) {
            if (model.wasPropertyExplicitlySet("comment")) {
                this.comment(model.getComment());
            }
            if (model.wasPropertyExplicitlySet("customProperties")) {
                this.customProperties(model.getCustomProperties());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isMigratable")) {
                this.isMigratable(model.getIsMigratable());
            }
            if (model.wasPropertyExplicitlySet("vnicProfileName")) {
                this.vnicProfileName(model.getVnicProfileName());
            }
            if (model.wasPropertyExplicitlySet("passThrough")) {
                this.passThrough(model.getPassThrough());
            }
            if (model.wasPropertyExplicitlySet("isPortMirroring")) {
                this.isPortMirroring(model.getIsPortMirroring());
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
     * Free text containing comments about this object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

    /**
     * Free text containing comments about this object.
     * @return the value
     **/
    public String getComment() {
        return comment;
    }

    /**
     * Custom properties applied to the vNIC profile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customProperties")
    private final java.util.List<OlvmCustomProperty> customProperties;

    /**
     * Custom properties applied to the vNIC profile.
     * @return the value
     **/
    public java.util.List<OlvmCustomProperty> getCustomProperties() {
        return customProperties;
    }

    /**
     * A human-readable description in plain text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A human-readable description in plain text.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Indicates whether passThrough NIC is migratable or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMigratable")
    private final Boolean isMigratable;

    /**
     * Indicates whether passThrough NIC is migratable or not.
     * @return the value
     **/
    public Boolean getIsMigratable() {
        return isMigratable;
    }

    /**
     * A human-readable name in plain text
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnicProfileName")
    private final String vnicProfileName;

    /**
     * A human-readable name in plain text
     * @return the value
     **/
    public String getVnicProfileName() {
        return vnicProfileName;
    }

    /**
     * Describes whether the vNIC is to be implemented as a pass-through device or a virtual one.
     **/
    public enum PassThrough {
        Disabled("DISABLED"),
        Enabled("ENABLED"),
        ;

        private final String value;
        private static java.util.Map<String, PassThrough> map;

        static {
            map = new java.util.HashMap<>();
            for (PassThrough v : PassThrough.values()) {
                map.put(v.getValue(), v);
            }
        }

        PassThrough(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PassThrough create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PassThrough: " + key);
        }
    };
    /**
     * Describes whether the vNIC is to be implemented as a pass-through device or a virtual one.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passThrough")
    private final PassThrough passThrough;

    /**
     * Describes whether the vNIC is to be implemented as a pass-through device or a virtual one.
     * @return the value
     **/
    public PassThrough getPassThrough() {
        return passThrough;
    }

    /**
     * Indicates if port mirroring is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPortMirroring")
    private final Boolean isPortMirroring;

    /**
     * Indicates if port mirroring is enabled.
     * @return the value
     **/
    public Boolean getIsPortMirroring() {
        return isPortMirroring;
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
        sb.append("OlvmVnicProfileProperties(");
        sb.append("super=").append(super.toString());
        sb.append("comment=").append(String.valueOf(this.comment));
        sb.append(", customProperties=").append(String.valueOf(this.customProperties));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isMigratable=").append(String.valueOf(this.isMigratable));
        sb.append(", vnicProfileName=").append(String.valueOf(this.vnicProfileName));
        sb.append(", passThrough=").append(String.valueOf(this.passThrough));
        sb.append(", isPortMirroring=").append(String.valueOf(this.isPortMirroring));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmVnicProfileProperties)) {
            return false;
        }

        OlvmVnicProfileProperties other = (OlvmVnicProfileProperties) o;
        return java.util.Objects.equals(this.comment, other.comment)
                && java.util.Objects.equals(this.customProperties, other.customProperties)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isMigratable, other.isMigratable)
                && java.util.Objects.equals(this.vnicProfileName, other.vnicProfileName)
                && java.util.Objects.equals(this.passThrough, other.passThrough)
                && java.util.Objects.equals(this.isPortMirroring, other.isPortMirroring)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result =
                (result * PRIME)
                        + (this.customProperties == null ? 43 : this.customProperties.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.isMigratable == null ? 43 : this.isMigratable.hashCode());
        result =
                (result * PRIME)
                        + (this.vnicProfileName == null ? 43 : this.vnicProfileName.hashCode());
        result = (result * PRIME) + (this.passThrough == null ? 43 : this.passThrough.hashCode());
        result =
                (result * PRIME)
                        + (this.isPortMirroring == null ? 43 : this.isPortMirroring.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
