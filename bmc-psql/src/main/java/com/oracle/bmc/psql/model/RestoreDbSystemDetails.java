/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Backup details to restore the database system. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RestoreDbSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RestoreDbSystemDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"backupId", "ad"})
    public RestoreDbSystemDetails(String backupId, String ad) {
        super();
        this.backupId = backupId;
        this.ad = ad;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * database system backup.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupId")
        private String backupId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * database system backup.
         *
         * @param backupId the value to set
         * @return this builder
         */
        public Builder backupId(String backupId) {
            this.backupId = backupId;
            this.__explicitlySet__.add("backupId");
            return this;
        }
        /**
         * The desired AD for regions with three ADs. This parameter is optional. If not set, the AD
         * is chosen based on the database system's current AD.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ad")
        private String ad;

        /**
         * The desired AD for regions with three ADs. This parameter is optional. If not set, the AD
         * is chosen based on the database system's current AD.
         *
         * @param ad the value to set
         * @return this builder
         */
        public Builder ad(String ad) {
            this.ad = ad;
            this.__explicitlySet__.add("ad");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RestoreDbSystemDetails build() {
            RestoreDbSystemDetails model = new RestoreDbSystemDetails(this.backupId, this.ad);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RestoreDbSystemDetails model) {
            if (model.wasPropertyExplicitlySet("backupId")) {
                this.backupId(model.getBackupId());
            }
            if (model.wasPropertyExplicitlySet("ad")) {
                this.ad(model.getAd());
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * database system backup.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupId")
    private final String backupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * database system backup.
     *
     * @return the value
     */
    public String getBackupId() {
        return backupId;
    }

    /**
     * The desired AD for regions with three ADs. This parameter is optional. If not set, the AD is
     * chosen based on the database system's current AD.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ad")
    private final String ad;

    /**
     * The desired AD for regions with three ADs. This parameter is optional. If not set, the AD is
     * chosen based on the database system's current AD.
     *
     * @return the value
     */
    public String getAd() {
        return ad;
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
        sb.append("RestoreDbSystemDetails(");
        sb.append("super=").append(super.toString());
        sb.append("backupId=").append(String.valueOf(this.backupId));
        sb.append(", ad=").append(String.valueOf(this.ad));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RestoreDbSystemDetails)) {
            return false;
        }

        RestoreDbSystemDetails other = (RestoreDbSystemDetails) o;
        return java.util.Objects.equals(this.backupId, other.backupId)
                && java.util.Objects.equals(this.ad, other.ad)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.backupId == null ? 43 : this.backupId.hashCode());
        result = (result * PRIME) + (this.ad == null ? 43 : this.ad.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
