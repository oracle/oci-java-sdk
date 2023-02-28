/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Data Transfer Medium details for the Migration. If not specified, it will default to Database
 * Link. Only one type of data transfer medium can be specified, except for the case of Amazon RDS
 * Oracle as source, where Object Storage Details along with AwsS3Details are required. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDataTransferMediumDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateDataTransferMediumDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "databaseLinkDetails",
        "objectStorageDetails",
        "awsS3Details"
    })
    public CreateDataTransferMediumDetails(
            CreateDatabaseLinkDetails databaseLinkDetails,
            CreateObjectStoreBucket objectStorageDetails,
            CreateAwsS3Details awsS3Details) {
        super();
        this.databaseLinkDetails = databaseLinkDetails;
        this.objectStorageDetails = objectStorageDetails;
        this.awsS3Details = awsS3Details;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("databaseLinkDetails")
        private CreateDatabaseLinkDetails databaseLinkDetails;

        public Builder databaseLinkDetails(CreateDatabaseLinkDetails databaseLinkDetails) {
            this.databaseLinkDetails = databaseLinkDetails;
            this.__explicitlySet__.add("databaseLinkDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageDetails")
        private CreateObjectStoreBucket objectStorageDetails;

        public Builder objectStorageDetails(CreateObjectStoreBucket objectStorageDetails) {
            this.objectStorageDetails = objectStorageDetails;
            this.__explicitlySet__.add("objectStorageDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("awsS3Details")
        private CreateAwsS3Details awsS3Details;

        public Builder awsS3Details(CreateAwsS3Details awsS3Details) {
            this.awsS3Details = awsS3Details;
            this.__explicitlySet__.add("awsS3Details");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDataTransferMediumDetails build() {
            CreateDataTransferMediumDetails model =
                    new CreateDataTransferMediumDetails(
                            this.databaseLinkDetails, this.objectStorageDetails, this.awsS3Details);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDataTransferMediumDetails model) {
            if (model.wasPropertyExplicitlySet("databaseLinkDetails")) {
                this.databaseLinkDetails(model.getDatabaseLinkDetails());
            }
            if (model.wasPropertyExplicitlySet("objectStorageDetails")) {
                this.objectStorageDetails(model.getObjectStorageDetails());
            }
            if (model.wasPropertyExplicitlySet("awsS3Details")) {
                this.awsS3Details(model.getAwsS3Details());
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

    @com.fasterxml.jackson.annotation.JsonProperty("databaseLinkDetails")
    private final CreateDatabaseLinkDetails databaseLinkDetails;

    public CreateDatabaseLinkDetails getDatabaseLinkDetails() {
        return databaseLinkDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageDetails")
    private final CreateObjectStoreBucket objectStorageDetails;

    public CreateObjectStoreBucket getObjectStorageDetails() {
        return objectStorageDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("awsS3Details")
    private final CreateAwsS3Details awsS3Details;

    public CreateAwsS3Details getAwsS3Details() {
        return awsS3Details;
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
        sb.append("CreateDataTransferMediumDetails(");
        sb.append("super=").append(super.toString());
        sb.append("databaseLinkDetails=").append(String.valueOf(this.databaseLinkDetails));
        sb.append(", objectStorageDetails=").append(String.valueOf(this.objectStorageDetails));
        sb.append(", awsS3Details=").append(String.valueOf(this.awsS3Details));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDataTransferMediumDetails)) {
            return false;
        }

        CreateDataTransferMediumDetails other = (CreateDataTransferMediumDetails) o;
        return java.util.Objects.equals(this.databaseLinkDetails, other.databaseLinkDetails)
                && java.util.Objects.equals(this.objectStorageDetails, other.objectStorageDetails)
                && java.util.Objects.equals(this.awsS3Details, other.awsS3Details)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.databaseLinkDetails == null
                                ? 43
                                : this.databaseLinkDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStorageDetails == null
                                ? 43
                                : this.objectStorageDetails.hashCode());
        result = (result * PRIME) + (this.awsS3Details == null ? 43 : this.awsS3Details.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
