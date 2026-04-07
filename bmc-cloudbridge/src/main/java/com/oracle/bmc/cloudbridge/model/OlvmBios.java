/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * OLVM Bios <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OlvmBios.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmBios extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"bootMenu", "biosType"})
    public OlvmBios(OlvmBootMenu bootMenu, OlvmBiosType biosType) {
        super();
        this.bootMenu = bootMenu;
        this.biosType = biosType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("bootMenu")
        private OlvmBootMenu bootMenu;

        public Builder bootMenu(OlvmBootMenu bootMenu) {
            this.bootMenu = bootMenu;
            this.__explicitlySet__.add("bootMenu");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("biosType")
        private OlvmBiosType biosType;

        public Builder biosType(OlvmBiosType biosType) {
            this.biosType = biosType;
            this.__explicitlySet__.add("biosType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmBios build() {
            OlvmBios model = new OlvmBios(this.bootMenu, this.biosType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmBios model) {
            if (model.wasPropertyExplicitlySet("bootMenu")) {
                this.bootMenu(model.getBootMenu());
            }
            if (model.wasPropertyExplicitlySet("biosType")) {
                this.biosType(model.getBiosType());
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

    @com.fasterxml.jackson.annotation.JsonProperty("bootMenu")
    private final OlvmBootMenu bootMenu;

    public OlvmBootMenu getBootMenu() {
        return bootMenu;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("biosType")
    private final OlvmBiosType biosType;

    public OlvmBiosType getBiosType() {
        return biosType;
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
        sb.append("OlvmBios(");
        sb.append("super=").append(super.toString());
        sb.append("bootMenu=").append(String.valueOf(this.bootMenu));
        sb.append(", biosType=").append(String.valueOf(this.biosType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmBios)) {
            return false;
        }

        OlvmBios other = (OlvmBios) o;
        return java.util.Objects.equals(this.bootMenu, other.bootMenu)
                && java.util.Objects.equals(this.biosType, other.biosType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.bootMenu == null ? 43 : this.bootMenu.hashCode());
        result = (result * PRIME) + (this.biosType == null ? 43 : this.biosType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
