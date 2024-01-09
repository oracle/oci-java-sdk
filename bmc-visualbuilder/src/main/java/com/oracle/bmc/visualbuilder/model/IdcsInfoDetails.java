/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.visualbuilder.model;

/**
 * Information for IDCS access <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IdcsInfoDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IdcsInfoDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "idcsAppLocationUrl",
        "idcsAppDisplayName",
        "idcsAppId",
        "idcsAppName",
        "instancePrimaryAudienceUrl"
    })
    public IdcsInfoDetails(
            String idcsAppLocationUrl,
            String idcsAppDisplayName,
            String idcsAppId,
            String idcsAppName,
            String instancePrimaryAudienceUrl) {
        super();
        this.idcsAppLocationUrl = idcsAppLocationUrl;
        this.idcsAppDisplayName = idcsAppDisplayName;
        this.idcsAppId = idcsAppId;
        this.idcsAppName = idcsAppName;
        this.instancePrimaryAudienceUrl = instancePrimaryAudienceUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** URL for the location of the IDCS Application (used by IDCS APIs) */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAppLocationUrl")
        private String idcsAppLocationUrl;

        /**
         * URL for the location of the IDCS Application (used by IDCS APIs)
         *
         * @param idcsAppLocationUrl the value to set
         * @return this builder
         */
        public Builder idcsAppLocationUrl(String idcsAppLocationUrl) {
            this.idcsAppLocationUrl = idcsAppLocationUrl;
            this.__explicitlySet__.add("idcsAppLocationUrl");
            return this;
        }
        /** The IDCS application display name associated with the instance */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAppDisplayName")
        private String idcsAppDisplayName;

        /**
         * The IDCS application display name associated with the instance
         *
         * @param idcsAppDisplayName the value to set
         * @return this builder
         */
        public Builder idcsAppDisplayName(String idcsAppDisplayName) {
            this.idcsAppDisplayName = idcsAppDisplayName;
            this.__explicitlySet__.add("idcsAppDisplayName");
            return this;
        }
        /** The IDCS application ID associated with the instance */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAppId")
        private String idcsAppId;

        /**
         * The IDCS application ID associated with the instance
         *
         * @param idcsAppId the value to set
         * @return this builder
         */
        public Builder idcsAppId(String idcsAppId) {
            this.idcsAppId = idcsAppId;
            this.__explicitlySet__.add("idcsAppId");
            return this;
        }
        /** The IDCS application name associated with the instance */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAppName")
        private String idcsAppName;

        /**
         * The IDCS application name associated with the instance
         *
         * @param idcsAppName the value to set
         * @return this builder
         */
        public Builder idcsAppName(String idcsAppName) {
            this.idcsAppName = idcsAppName;
            this.__explicitlySet__.add("idcsAppName");
            return this;
        }
        /**
         * The URL used as the primary audience for visual builder flows in this instance type:
         * string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instancePrimaryAudienceUrl")
        private String instancePrimaryAudienceUrl;

        /**
         * The URL used as the primary audience for visual builder flows in this instance type:
         * string
         *
         * @param instancePrimaryAudienceUrl the value to set
         * @return this builder
         */
        public Builder instancePrimaryAudienceUrl(String instancePrimaryAudienceUrl) {
            this.instancePrimaryAudienceUrl = instancePrimaryAudienceUrl;
            this.__explicitlySet__.add("instancePrimaryAudienceUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IdcsInfoDetails build() {
            IdcsInfoDetails model =
                    new IdcsInfoDetails(
                            this.idcsAppLocationUrl,
                            this.idcsAppDisplayName,
                            this.idcsAppId,
                            this.idcsAppName,
                            this.instancePrimaryAudienceUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdcsInfoDetails model) {
            if (model.wasPropertyExplicitlySet("idcsAppLocationUrl")) {
                this.idcsAppLocationUrl(model.getIdcsAppLocationUrl());
            }
            if (model.wasPropertyExplicitlySet("idcsAppDisplayName")) {
                this.idcsAppDisplayName(model.getIdcsAppDisplayName());
            }
            if (model.wasPropertyExplicitlySet("idcsAppId")) {
                this.idcsAppId(model.getIdcsAppId());
            }
            if (model.wasPropertyExplicitlySet("idcsAppName")) {
                this.idcsAppName(model.getIdcsAppName());
            }
            if (model.wasPropertyExplicitlySet("instancePrimaryAudienceUrl")) {
                this.instancePrimaryAudienceUrl(model.getInstancePrimaryAudienceUrl());
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

    /** URL for the location of the IDCS Application (used by IDCS APIs) */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAppLocationUrl")
    private final String idcsAppLocationUrl;

    /**
     * URL for the location of the IDCS Application (used by IDCS APIs)
     *
     * @return the value
     */
    public String getIdcsAppLocationUrl() {
        return idcsAppLocationUrl;
    }

    /** The IDCS application display name associated with the instance */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAppDisplayName")
    private final String idcsAppDisplayName;

    /**
     * The IDCS application display name associated with the instance
     *
     * @return the value
     */
    public String getIdcsAppDisplayName() {
        return idcsAppDisplayName;
    }

    /** The IDCS application ID associated with the instance */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAppId")
    private final String idcsAppId;

    /**
     * The IDCS application ID associated with the instance
     *
     * @return the value
     */
    public String getIdcsAppId() {
        return idcsAppId;
    }

    /** The IDCS application name associated with the instance */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAppName")
    private final String idcsAppName;

    /**
     * The IDCS application name associated with the instance
     *
     * @return the value
     */
    public String getIdcsAppName() {
        return idcsAppName;
    }

    /**
     * The URL used as the primary audience for visual builder flows in this instance type: string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instancePrimaryAudienceUrl")
    private final String instancePrimaryAudienceUrl;

    /**
     * The URL used as the primary audience for visual builder flows in this instance type: string
     *
     * @return the value
     */
    public String getInstancePrimaryAudienceUrl() {
        return instancePrimaryAudienceUrl;
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
        sb.append("IdcsInfoDetails(");
        sb.append("super=").append(super.toString());
        sb.append("idcsAppLocationUrl=").append(String.valueOf(this.idcsAppLocationUrl));
        sb.append(", idcsAppDisplayName=").append(String.valueOf(this.idcsAppDisplayName));
        sb.append(", idcsAppId=").append(String.valueOf(this.idcsAppId));
        sb.append(", idcsAppName=").append(String.valueOf(this.idcsAppName));
        sb.append(", instancePrimaryAudienceUrl=")
                .append(String.valueOf(this.instancePrimaryAudienceUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdcsInfoDetails)) {
            return false;
        }

        IdcsInfoDetails other = (IdcsInfoDetails) o;
        return java.util.Objects.equals(this.idcsAppLocationUrl, other.idcsAppLocationUrl)
                && java.util.Objects.equals(this.idcsAppDisplayName, other.idcsAppDisplayName)
                && java.util.Objects.equals(this.idcsAppId, other.idcsAppId)
                && java.util.Objects.equals(this.idcsAppName, other.idcsAppName)
                && java.util.Objects.equals(
                        this.instancePrimaryAudienceUrl, other.instancePrimaryAudienceUrl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.idcsAppLocationUrl == null
                                ? 43
                                : this.idcsAppLocationUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsAppDisplayName == null
                                ? 43
                                : this.idcsAppDisplayName.hashCode());
        result = (result * PRIME) + (this.idcsAppId == null ? 43 : this.idcsAppId.hashCode());
        result = (result * PRIME) + (this.idcsAppName == null ? 43 : this.idcsAppName.hashCode());
        result =
                (result * PRIME)
                        + (this.instancePrimaryAudienceUrl == null
                                ? 43
                                : this.instancePrimaryAudienceUrl.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
