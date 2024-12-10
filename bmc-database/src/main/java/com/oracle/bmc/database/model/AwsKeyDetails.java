/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for AWS encryption key.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AwsKeyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "provider"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AwsKeyDetails extends AutonomousDatabaseEncryptionKeyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * AWS key service endpoint URI
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceEndpointUri")
        private String serviceEndpointUri;

        /**
         * AWS key service endpoint URI
         * @param serviceEndpointUri the value to set
         * @return this builder
         **/
        public Builder serviceEndpointUri(String serviceEndpointUri) {
            this.serviceEndpointUri = serviceEndpointUri;
            this.__explicitlySet__.add("serviceEndpointUri");
            return this;
        }
        /**
         * AWS key ARN
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyArn")
        private String keyArn;

        /**
         * AWS key ARN
         * @param keyArn the value to set
         * @return this builder
         **/
        public Builder keyArn(String keyArn) {
            this.keyArn = keyArn;
            this.__explicitlySet__.add("keyArn");
            return this;
        }
        /**
         * AWS ARN role
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("arnRole")
        private String arnRole;

        /**
         * AWS ARN role
         * @param arnRole the value to set
         * @return this builder
         **/
        public Builder arnRole(String arnRole) {
            this.arnRole = arnRole;
            this.__explicitlySet__.add("arnRole");
            return this;
        }
        /**
         * AWS external ID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("externalId")
        private String externalId;

        /**
         * AWS external ID
         * @param externalId the value to set
         * @return this builder
         **/
        public Builder externalId(String externalId) {
            this.externalId = externalId;
            this.__explicitlySet__.add("externalId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwsKeyDetails build() {
            AwsKeyDetails model =
                    new AwsKeyDetails(
                            this.serviceEndpointUri, this.keyArn, this.arnRole, this.externalId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwsKeyDetails model) {
            if (model.wasPropertyExplicitlySet("serviceEndpointUri")) {
                this.serviceEndpointUri(model.getServiceEndpointUri());
            }
            if (model.wasPropertyExplicitlySet("keyArn")) {
                this.keyArn(model.getKeyArn());
            }
            if (model.wasPropertyExplicitlySet("arnRole")) {
                this.arnRole(model.getArnRole());
            }
            if (model.wasPropertyExplicitlySet("externalId")) {
                this.externalId(model.getExternalId());
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
    public AwsKeyDetails(
            String serviceEndpointUri, String keyArn, String arnRole, String externalId) {
        super();
        this.serviceEndpointUri = serviceEndpointUri;
        this.keyArn = keyArn;
        this.arnRole = arnRole;
        this.externalId = externalId;
    }

    /**
     * AWS key service endpoint URI
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceEndpointUri")
    private final String serviceEndpointUri;

    /**
     * AWS key service endpoint URI
     * @return the value
     **/
    public String getServiceEndpointUri() {
        return serviceEndpointUri;
    }

    /**
     * AWS key ARN
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyArn")
    private final String keyArn;

    /**
     * AWS key ARN
     * @return the value
     **/
    public String getKeyArn() {
        return keyArn;
    }

    /**
     * AWS ARN role
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arnRole")
    private final String arnRole;

    /**
     * AWS ARN role
     * @return the value
     **/
    public String getArnRole() {
        return arnRole;
    }

    /**
     * AWS external ID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalId")
    private final String externalId;

    /**
     * AWS external ID
     * @return the value
     **/
    public String getExternalId() {
        return externalId;
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
        sb.append("AwsKeyDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", serviceEndpointUri=").append(String.valueOf(this.serviceEndpointUri));
        sb.append(", keyArn=").append(String.valueOf(this.keyArn));
        sb.append(", arnRole=").append(String.valueOf(this.arnRole));
        sb.append(", externalId=").append(String.valueOf(this.externalId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwsKeyDetails)) {
            return false;
        }

        AwsKeyDetails other = (AwsKeyDetails) o;
        return java.util.Objects.equals(this.serviceEndpointUri, other.serviceEndpointUri)
                && java.util.Objects.equals(this.keyArn, other.keyArn)
                && java.util.Objects.equals(this.arnRole, other.arnRole)
                && java.util.Objects.equals(this.externalId, other.externalId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.serviceEndpointUri == null
                                ? 43
                                : this.serviceEndpointUri.hashCode());
        result = (result * PRIME) + (this.keyArn == null ? 43 : this.keyArn.hashCode());
        result = (result * PRIME) + (this.arnRole == null ? 43 : this.arnRole.hashCode());
        result = (result * PRIME) + (this.externalId == null ? 43 : this.externalId.hashCode());
        return result;
    }
}
