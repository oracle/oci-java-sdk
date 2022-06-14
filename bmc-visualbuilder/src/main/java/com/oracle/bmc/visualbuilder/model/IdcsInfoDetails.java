/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.visualbuilder.model;

/**
 * Information for IDCS access
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IdcsInfoDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IdcsInfoDetails {
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
        /**
         * URL for the location of the IDCS Application (used by IDCS APIs)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAppLocationUrl")
        private String idcsAppLocationUrl;

        /**
         * URL for the location of the IDCS Application (used by IDCS APIs)
         * @param idcsAppLocationUrl the value to set
         * @return this builder
         **/
        public Builder idcsAppLocationUrl(String idcsAppLocationUrl) {
            this.idcsAppLocationUrl = idcsAppLocationUrl;
            this.__explicitlySet__.add("idcsAppLocationUrl");
            return this;
        }
        /**
         * The IDCS application display name associated with the instance
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAppDisplayName")
        private String idcsAppDisplayName;

        /**
         * The IDCS application display name associated with the instance
         * @param idcsAppDisplayName the value to set
         * @return this builder
         **/
        public Builder idcsAppDisplayName(String idcsAppDisplayName) {
            this.idcsAppDisplayName = idcsAppDisplayName;
            this.__explicitlySet__.add("idcsAppDisplayName");
            return this;
        }
        /**
         * The IDCS application ID associated with the instance
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAppId")
        private String idcsAppId;

        /**
         * The IDCS application ID associated with the instance
         * @param idcsAppId the value to set
         * @return this builder
         **/
        public Builder idcsAppId(String idcsAppId) {
            this.idcsAppId = idcsAppId;
            this.__explicitlySet__.add("idcsAppId");
            return this;
        }
        /**
         * The IDCS application name associated with the instance
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAppName")
        private String idcsAppName;

        /**
         * The IDCS application name associated with the instance
         * @param idcsAppName the value to set
         * @return this builder
         **/
        public Builder idcsAppName(String idcsAppName) {
            this.idcsAppName = idcsAppName;
            this.__explicitlySet__.add("idcsAppName");
            return this;
        }
        /**
         * The URL used as the primary audience for visual builder flows in this instance
         * type: string
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instancePrimaryAudienceUrl")
        private String instancePrimaryAudienceUrl;

        /**
         * The URL used as the primary audience for visual builder flows in this instance
         * type: string
         *
         * @param instancePrimaryAudienceUrl the value to set
         * @return this builder
         **/
        public Builder instancePrimaryAudienceUrl(String instancePrimaryAudienceUrl) {
            this.instancePrimaryAudienceUrl = instancePrimaryAudienceUrl;
            this.__explicitlySet__.add("instancePrimaryAudienceUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IdcsInfoDetails build() {
            IdcsInfoDetails __instance__ =
                    new IdcsInfoDetails(
                            idcsAppLocationUrl,
                            idcsAppDisplayName,
                            idcsAppId,
                            idcsAppName,
                            instancePrimaryAudienceUrl);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdcsInfoDetails o) {
            Builder copiedBuilder =
                    idcsAppLocationUrl(o.getIdcsAppLocationUrl())
                            .idcsAppDisplayName(o.getIdcsAppDisplayName())
                            .idcsAppId(o.getIdcsAppId())
                            .idcsAppName(o.getIdcsAppName())
                            .instancePrimaryAudienceUrl(o.getInstancePrimaryAudienceUrl());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * URL for the location of the IDCS Application (used by IDCS APIs)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAppLocationUrl")
    private final String idcsAppLocationUrl;

    /**
     * URL for the location of the IDCS Application (used by IDCS APIs)
     * @return the value
     **/
    public String getIdcsAppLocationUrl() {
        return idcsAppLocationUrl;
    }

    /**
     * The IDCS application display name associated with the instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAppDisplayName")
    private final String idcsAppDisplayName;

    /**
     * The IDCS application display name associated with the instance
     * @return the value
     **/
    public String getIdcsAppDisplayName() {
        return idcsAppDisplayName;
    }

    /**
     * The IDCS application ID associated with the instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAppId")
    private final String idcsAppId;

    /**
     * The IDCS application ID associated with the instance
     * @return the value
     **/
    public String getIdcsAppId() {
        return idcsAppId;
    }

    /**
     * The IDCS application name associated with the instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAppName")
    private final String idcsAppName;

    /**
     * The IDCS application name associated with the instance
     * @return the value
     **/
    public String getIdcsAppName() {
        return idcsAppName;
    }

    /**
     * The URL used as the primary audience for visual builder flows in this instance
     * type: string
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instancePrimaryAudienceUrl")
    private final String instancePrimaryAudienceUrl;

    /**
     * The URL used as the primary audience for visual builder flows in this instance
     * type: string
     *
     * @return the value
     **/
    public String getInstancePrimaryAudienceUrl() {
        return instancePrimaryAudienceUrl;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("IdcsInfoDetails(");
        sb.append("idcsAppLocationUrl=").append(String.valueOf(this.idcsAppLocationUrl));
        sb.append(", idcsAppDisplayName=").append(String.valueOf(this.idcsAppDisplayName));
        sb.append(", idcsAppId=").append(String.valueOf(this.idcsAppId));
        sb.append(", idcsAppName=").append(String.valueOf(this.idcsAppName));
        sb.append(", instancePrimaryAudienceUrl=")
                .append(String.valueOf(this.instancePrimaryAudienceUrl));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
