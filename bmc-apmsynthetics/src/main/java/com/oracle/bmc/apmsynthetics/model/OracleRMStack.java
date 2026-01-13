/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details of the Oracle Resource Manager stack, which is a subtype of the Dedicated Vantage Point
 * stack. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OracleRMStack.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "dvpStackType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OracleRMStack extends DvpStackDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("dvpVersion")
        private String dvpVersion;

        public Builder dvpVersion(String dvpVersion) {
            this.dvpVersion = dvpVersion;
            this.__explicitlySet__.add("dvpVersion");
            return this;
        }
        /**
         * Stack [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the Resource Manager stack for dedicated vantage point.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dvpStackId")
        private String dvpStackId;

        /**
         * Stack [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the Resource Manager stack for dedicated vantage point.
         *
         * @param dvpStackId the value to set
         * @return this builder
         */
        public Builder dvpStackId(String dvpStackId) {
            this.dvpStackId = dvpStackId;
            this.__explicitlySet__.add("dvpStackId");
            return this;
        }
        /**
         * Stream [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the Resource Manager stack for dedicated vantage point.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dvpStreamId")
        private String dvpStreamId;

        /**
         * Stream [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the Resource Manager stack for dedicated vantage point.
         *
         * @param dvpStreamId the value to set
         * @return this builder
         */
        public Builder dvpStreamId(String dvpStreamId) {
            this.dvpStreamId = dvpStreamId;
            this.__explicitlySet__.add("dvpStreamId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OracleRMStack build() {
            OracleRMStack model =
                    new OracleRMStack(this.dvpVersion, this.dvpStackId, this.dvpStreamId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OracleRMStack model) {
            if (model.wasPropertyExplicitlySet("dvpVersion")) {
                this.dvpVersion(model.getDvpVersion());
            }
            if (model.wasPropertyExplicitlySet("dvpStackId")) {
                this.dvpStackId(model.getDvpStackId());
            }
            if (model.wasPropertyExplicitlySet("dvpStreamId")) {
                this.dvpStreamId(model.getDvpStreamId());
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

    @Deprecated
    public OracleRMStack(String dvpVersion, String dvpStackId, String dvpStreamId) {
        super(dvpVersion);
        this.dvpStackId = dvpStackId;
        this.dvpStreamId = dvpStreamId;
    }

    /**
     * Stack [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Resource Manager stack for dedicated vantage point.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dvpStackId")
    private final String dvpStackId;

    /**
     * Stack [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Resource Manager stack for dedicated vantage point.
     *
     * @return the value
     */
    public String getDvpStackId() {
        return dvpStackId;
    }

    /**
     * Stream [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Resource Manager stack for dedicated vantage point.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dvpStreamId")
    private final String dvpStreamId;

    /**
     * Stream [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Resource Manager stack for dedicated vantage point.
     *
     * @return the value
     */
    public String getDvpStreamId() {
        return dvpStreamId;
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
        sb.append("OracleRMStack(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dvpStackId=").append(String.valueOf(this.dvpStackId));
        sb.append(", dvpStreamId=").append(String.valueOf(this.dvpStreamId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OracleRMStack)) {
            return false;
        }

        OracleRMStack other = (OracleRMStack) o;
        return java.util.Objects.equals(this.dvpStackId, other.dvpStackId)
                && java.util.Objects.equals(this.dvpStreamId, other.dvpStreamId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dvpStackId == null ? 43 : this.dvpStackId.hashCode());
        result = (result * PRIME) + (this.dvpStreamId == null ? 43 : this.dvpStreamId.hashCode());
        return result;
    }
}
