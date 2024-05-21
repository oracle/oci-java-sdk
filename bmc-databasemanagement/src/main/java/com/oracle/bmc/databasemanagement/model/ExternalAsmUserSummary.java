/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of an ASM user.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExternalAsmUserSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExternalAsmUserSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "privileges", "asmId"})
    public ExternalAsmUserSummary(String name, java.util.List<String> privileges, String asmId) {
        super();
        this.name = name;
        this.privileges = privileges;
        this.asmId = asmId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the ASM user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the ASM user.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The list of privileges of the ASM user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privileges")
        private java.util.List<String> privileges;

        /**
         * The list of privileges of the ASM user.
         * @param privileges the value to set
         * @return this builder
         **/
        public Builder privileges(java.util.List<String> privileges) {
            this.privileges = privileges;
            this.__explicitlySet__.add("privileges");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external ASM.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("asmId")
        private String asmId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external ASM.
         * @param asmId the value to set
         * @return this builder
         **/
        public Builder asmId(String asmId) {
            this.asmId = asmId;
            this.__explicitlySet__.add("asmId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalAsmUserSummary build() {
            ExternalAsmUserSummary model =
                    new ExternalAsmUserSummary(this.name, this.privileges, this.asmId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalAsmUserSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("privileges")) {
                this.privileges(model.getPrivileges());
            }
            if (model.wasPropertyExplicitlySet("asmId")) {
                this.asmId(model.getAsmId());
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
     * The name of the ASM user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the ASM user.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The list of privileges of the ASM user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privileges")
    private final java.util.List<String> privileges;

    /**
     * The list of privileges of the ASM user.
     * @return the value
     **/
    public java.util.List<String> getPrivileges() {
        return privileges;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external ASM.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("asmId")
    private final String asmId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external ASM.
     * @return the value
     **/
    public String getAsmId() {
        return asmId;
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
        sb.append("ExternalAsmUserSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", privileges=").append(String.valueOf(this.privileges));
        sb.append(", asmId=").append(String.valueOf(this.asmId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalAsmUserSummary)) {
            return false;
        }

        ExternalAsmUserSummary other = (ExternalAsmUserSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.privileges, other.privileges)
                && java.util.Objects.equals(this.asmId, other.asmId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.privileges == null ? 43 : this.privileges.hashCode());
        result = (result * PRIME) + (this.asmId == null ? 43 : this.asmId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
