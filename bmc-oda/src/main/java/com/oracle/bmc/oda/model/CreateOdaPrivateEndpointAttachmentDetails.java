/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties that are required to create an ODA private endpoint attachment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateOdaPrivateEndpointAttachmentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateOdaPrivateEndpointAttachmentDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"odaInstanceId", "odaPrivateEndpointId"})
    public CreateOdaPrivateEndpointAttachmentDetails(
            String odaInstanceId, String odaPrivateEndpointId) {
        super();
        this.odaInstanceId = odaInstanceId;
        this.odaPrivateEndpointId = odaPrivateEndpointId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the attached ODA Instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("odaInstanceId")
        private String odaInstanceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the attached ODA Instance.
         * @param odaInstanceId the value to set
         * @return this builder
         **/
        public Builder odaInstanceId(String odaInstanceId) {
            this.odaInstanceId = odaInstanceId;
            this.__explicitlySet__.add("odaInstanceId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ODA Private Endpoint.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("odaPrivateEndpointId")
        private String odaPrivateEndpointId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ODA Private Endpoint.
         * @param odaPrivateEndpointId the value to set
         * @return this builder
         **/
        public Builder odaPrivateEndpointId(String odaPrivateEndpointId) {
            this.odaPrivateEndpointId = odaPrivateEndpointId;
            this.__explicitlySet__.add("odaPrivateEndpointId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOdaPrivateEndpointAttachmentDetails build() {
            CreateOdaPrivateEndpointAttachmentDetails model =
                    new CreateOdaPrivateEndpointAttachmentDetails(
                            this.odaInstanceId, this.odaPrivateEndpointId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOdaPrivateEndpointAttachmentDetails model) {
            if (model.wasPropertyExplicitlySet("odaInstanceId")) {
                this.odaInstanceId(model.getOdaInstanceId());
            }
            if (model.wasPropertyExplicitlySet("odaPrivateEndpointId")) {
                this.odaPrivateEndpointId(model.getOdaPrivateEndpointId());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the attached ODA Instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("odaInstanceId")
    private final String odaInstanceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the attached ODA Instance.
     * @return the value
     **/
    public String getOdaInstanceId() {
        return odaInstanceId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ODA Private Endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("odaPrivateEndpointId")
    private final String odaPrivateEndpointId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the ODA Private Endpoint.
     * @return the value
     **/
    public String getOdaPrivateEndpointId() {
        return odaPrivateEndpointId;
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
        sb.append("CreateOdaPrivateEndpointAttachmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("odaInstanceId=").append(String.valueOf(this.odaInstanceId));
        sb.append(", odaPrivateEndpointId=").append(String.valueOf(this.odaPrivateEndpointId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOdaPrivateEndpointAttachmentDetails)) {
            return false;
        }

        CreateOdaPrivateEndpointAttachmentDetails other =
                (CreateOdaPrivateEndpointAttachmentDetails) o;
        return java.util.Objects.equals(this.odaInstanceId, other.odaInstanceId)
                && java.util.Objects.equals(this.odaPrivateEndpointId, other.odaPrivateEndpointId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.odaInstanceId == null ? 43 : this.odaInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.odaPrivateEndpointId == null
                                ? 43
                                : this.odaPrivateEndpointId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
