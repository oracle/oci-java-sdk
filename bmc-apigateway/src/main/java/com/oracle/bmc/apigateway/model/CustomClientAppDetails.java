/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Client App Credentials to be provided again.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CustomClientAppDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CustomClientAppDetails extends ClientAppDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Client ID for the OAuth2/OIDC app.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientId")
        private String clientId;

        /**
         * Client ID for the OAuth2/OIDC app.
         * @param clientId the value to set
         * @return this builder
         **/
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            this.__explicitlySet__.add("clientId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Vault Service secret resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientSecretId")
        private String clientSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Vault Service secret resource.
         *
         * @param clientSecretId the value to set
         * @return this builder
         **/
        public Builder clientSecretId(String clientSecretId) {
            this.clientSecretId = clientSecretId;
            this.__explicitlySet__.add("clientSecretId");
            return this;
        }
        /**
         * The version number of the client secret to use.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clientSecretVersionNumber")
        private Long clientSecretVersionNumber;

        /**
         * The version number of the client secret to use.
         * @param clientSecretVersionNumber the value to set
         * @return this builder
         **/
        public Builder clientSecretVersionNumber(Long clientSecretVersionNumber) {
            this.clientSecretVersionNumber = clientSecretVersionNumber;
            this.__explicitlySet__.add("clientSecretVersionNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomClientAppDetails build() {
            CustomClientAppDetails model =
                    new CustomClientAppDetails(
                            this.clientId, this.clientSecretId, this.clientSecretVersionNumber);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomClientAppDetails model) {
            if (model.wasPropertyExplicitlySet("clientId")) {
                this.clientId(model.getClientId());
            }
            if (model.wasPropertyExplicitlySet("clientSecretId")) {
                this.clientSecretId(model.getClientSecretId());
            }
            if (model.wasPropertyExplicitlySet("clientSecretVersionNumber")) {
                this.clientSecretVersionNumber(model.getClientSecretVersionNumber());
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
    public CustomClientAppDetails(
            String clientId, String clientSecretId, Long clientSecretVersionNumber) {
        super();
        this.clientId = clientId;
        this.clientSecretId = clientSecretId;
        this.clientSecretVersionNumber = clientSecretVersionNumber;
    }

    /**
     * Client ID for the OAuth2/OIDC app.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientId")
    private final String clientId;

    /**
     * Client ID for the OAuth2/OIDC app.
     * @return the value
     **/
    public String getClientId() {
        return clientId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Vault Service secret resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientSecretId")
    private final String clientSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Vault Service secret resource.
     *
     * @return the value
     **/
    public String getClientSecretId() {
        return clientSecretId;
    }

    /**
     * The version number of the client secret to use.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientSecretVersionNumber")
    private final Long clientSecretVersionNumber;

    /**
     * The version number of the client secret to use.
     * @return the value
     **/
    public Long getClientSecretVersionNumber() {
        return clientSecretVersionNumber;
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
        sb.append("CustomClientAppDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", clientId=").append(String.valueOf(this.clientId));
        sb.append(", clientSecretId=").append(String.valueOf(this.clientSecretId));
        sb.append(", clientSecretVersionNumber=")
                .append(String.valueOf(this.clientSecretVersionNumber));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomClientAppDetails)) {
            return false;
        }

        CustomClientAppDetails other = (CustomClientAppDetails) o;
        return java.util.Objects.equals(this.clientId, other.clientId)
                && java.util.Objects.equals(this.clientSecretId, other.clientSecretId)
                && java.util.Objects.equals(
                        this.clientSecretVersionNumber, other.clientSecretVersionNumber)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.clientId == null ? 43 : this.clientId.hashCode());
        result =
                (result * PRIME)
                        + (this.clientSecretId == null ? 43 : this.clientSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.clientSecretVersionNumber == null
                                ? 43
                                : this.clientSecretVersionNumber.hashCode());
        return result;
    }
}
