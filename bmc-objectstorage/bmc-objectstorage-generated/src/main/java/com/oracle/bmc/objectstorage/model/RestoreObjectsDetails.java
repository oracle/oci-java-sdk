/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RestoreObjectsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RestoreObjectsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"objectName", "hours", "versionId"})
    public RestoreObjectsDetails(String objectName, Integer hours, String versionId) {
        super();
        this.objectName = objectName;
        this.hours = hours;
        this.versionId = versionId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** An object that is in an archive storage tier and needs to be restored. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * An object that is in an archive storage tier and needs to be restored.
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /**
         * The number of hours for which this object will be restored. By default objects will be
         * restored for 24 hours. You can instead configure the duration using the hours parameter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hours")
        private Integer hours;

        /**
         * The number of hours for which this object will be restored. By default objects will be
         * restored for 24 hours. You can instead configure the duration using the hours parameter.
         *
         * @param hours the value to set
         * @return this builder
         */
        public Builder hours(Integer hours) {
            this.hours = hours;
            this.__explicitlySet__.add("hours");
            return this;
        }
        /** The versionId of the object to restore. Current object version is used by default. */
        @com.fasterxml.jackson.annotation.JsonProperty("versionId")
        private String versionId;

        /**
         * The versionId of the object to restore. Current object version is used by default.
         *
         * @param versionId the value to set
         * @return this builder
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            this.__explicitlySet__.add("versionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RestoreObjectsDetails build() {
            RestoreObjectsDetails model =
                    new RestoreObjectsDetails(this.objectName, this.hours, this.versionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RestoreObjectsDetails model) {
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("hours")) {
                this.hours(model.getHours());
            }
            if (model.wasPropertyExplicitlySet("versionId")) {
                this.versionId(model.getVersionId());
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

    /** An object that is in an archive storage tier and needs to be restored. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * An object that is in an archive storage tier and needs to be restored.
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * The number of hours for which this object will be restored. By default objects will be
     * restored for 24 hours. You can instead configure the duration using the hours parameter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hours")
    private final Integer hours;

    /**
     * The number of hours for which this object will be restored. By default objects will be
     * restored for 24 hours. You can instead configure the duration using the hours parameter.
     *
     * @return the value
     */
    public Integer getHours() {
        return hours;
    }

    /** The versionId of the object to restore. Current object version is used by default. */
    @com.fasterxml.jackson.annotation.JsonProperty("versionId")
    private final String versionId;

    /**
     * The versionId of the object to restore. Current object version is used by default.
     *
     * @return the value
     */
    public String getVersionId() {
        return versionId;
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
        sb.append("RestoreObjectsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("objectName=").append(String.valueOf(this.objectName));
        sb.append(", hours=").append(String.valueOf(this.hours));
        sb.append(", versionId=").append(String.valueOf(this.versionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RestoreObjectsDetails)) {
            return false;
        }

        RestoreObjectsDetails other = (RestoreObjectsDetails) o;
        return java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.hours, other.hours)
                && java.util.Objects.equals(this.versionId, other.versionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.hours == null ? 43 : this.hours.hashCode());
        result = (result * PRIME) + (this.versionId == null ? 43 : this.versionId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
