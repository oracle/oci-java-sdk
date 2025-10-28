/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for api gateway and vanity url(custom url) for dbTools. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VanityUrlDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VanityUrlDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isDisabled", "apiGatewayId", "vanityUrlHostName"})
    public VanityUrlDetails(Boolean isDisabled, String apiGatewayId, String vanityUrlHostName) {
        super();
        this.isDisabled = isDisabled;
        this.apiGatewayId = apiGatewayId;
        this.vanityUrlHostName = vanityUrlHostName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Indicates if the vanity url details should be deleted for the Autonomous AI Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDisabled")
        private Boolean isDisabled;

        /**
         * Indicates if the vanity url details should be deleted for the Autonomous AI Database.
         *
         * @param isDisabled the value to set
         * @return this builder
         */
        public Builder isDisabled(Boolean isDisabled) {
            this.isDisabled = isDisabled;
            this.__explicitlySet__.add("isDisabled");
            return this;
        }
        /** API Gateway ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("apiGatewayId")
        private String apiGatewayId;

        /**
         * API Gateway ID.
         *
         * @param apiGatewayId the value to set
         * @return this builder
         */
        public Builder apiGatewayId(String apiGatewayId) {
            this.apiGatewayId = apiGatewayId;
            this.__explicitlySet__.add("apiGatewayId");
            return this;
        }
        /** Custom URL prefix provided by the customer to access dbTools. */
        @com.fasterxml.jackson.annotation.JsonProperty("vanityUrlHostName")
        private String vanityUrlHostName;

        /**
         * Custom URL prefix provided by the customer to access dbTools.
         *
         * @param vanityUrlHostName the value to set
         * @return this builder
         */
        public Builder vanityUrlHostName(String vanityUrlHostName) {
            this.vanityUrlHostName = vanityUrlHostName;
            this.__explicitlySet__.add("vanityUrlHostName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VanityUrlDetails build() {
            VanityUrlDetails model =
                    new VanityUrlDetails(
                            this.isDisabled, this.apiGatewayId, this.vanityUrlHostName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VanityUrlDetails model) {
            if (model.wasPropertyExplicitlySet("isDisabled")) {
                this.isDisabled(model.getIsDisabled());
            }
            if (model.wasPropertyExplicitlySet("apiGatewayId")) {
                this.apiGatewayId(model.getApiGatewayId());
            }
            if (model.wasPropertyExplicitlySet("vanityUrlHostName")) {
                this.vanityUrlHostName(model.getVanityUrlHostName());
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

    /** Indicates if the vanity url details should be deleted for the Autonomous AI Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDisabled")
    private final Boolean isDisabled;

    /**
     * Indicates if the vanity url details should be deleted for the Autonomous AI Database.
     *
     * @return the value
     */
    public Boolean getIsDisabled() {
        return isDisabled;
    }

    /** API Gateway ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("apiGatewayId")
    private final String apiGatewayId;

    /**
     * API Gateway ID.
     *
     * @return the value
     */
    public String getApiGatewayId() {
        return apiGatewayId;
    }

    /** Custom URL prefix provided by the customer to access dbTools. */
    @com.fasterxml.jackson.annotation.JsonProperty("vanityUrlHostName")
    private final String vanityUrlHostName;

    /**
     * Custom URL prefix provided by the customer to access dbTools.
     *
     * @return the value
     */
    public String getVanityUrlHostName() {
        return vanityUrlHostName;
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
        sb.append("VanityUrlDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isDisabled=").append(String.valueOf(this.isDisabled));
        sb.append(", apiGatewayId=").append(String.valueOf(this.apiGatewayId));
        sb.append(", vanityUrlHostName=").append(String.valueOf(this.vanityUrlHostName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VanityUrlDetails)) {
            return false;
        }

        VanityUrlDetails other = (VanityUrlDetails) o;
        return java.util.Objects.equals(this.isDisabled, other.isDisabled)
                && java.util.Objects.equals(this.apiGatewayId, other.apiGatewayId)
                && java.util.Objects.equals(this.vanityUrlHostName, other.vanityUrlHostName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isDisabled == null ? 43 : this.isDisabled.hashCode());
        result = (result * PRIME) + (this.apiGatewayId == null ? 43 : this.apiGatewayId.hashCode());
        result =
                (result * PRIME)
                        + (this.vanityUrlHostName == null ? 43 : this.vanityUrlHostName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
