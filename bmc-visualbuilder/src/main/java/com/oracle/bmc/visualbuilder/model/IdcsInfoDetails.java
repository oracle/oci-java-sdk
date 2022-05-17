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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IdcsInfoDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class IdcsInfoDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAppLocationUrl")
        private String idcsAppLocationUrl;

        public Builder idcsAppLocationUrl(String idcsAppLocationUrl) {
            this.idcsAppLocationUrl = idcsAppLocationUrl;
            this.__explicitlySet__.add("idcsAppLocationUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("idcsAppDisplayName")
        private String idcsAppDisplayName;

        public Builder idcsAppDisplayName(String idcsAppDisplayName) {
            this.idcsAppDisplayName = idcsAppDisplayName;
            this.__explicitlySet__.add("idcsAppDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("idcsAppId")
        private String idcsAppId;

        public Builder idcsAppId(String idcsAppId) {
            this.idcsAppId = idcsAppId;
            this.__explicitlySet__.add("idcsAppId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("idcsAppName")
        private String idcsAppName;

        public Builder idcsAppName(String idcsAppName) {
            this.idcsAppName = idcsAppName;
            this.__explicitlySet__.add("idcsAppName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instancePrimaryAudienceUrl")
        private String instancePrimaryAudienceUrl;

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

    /**
     * URL for the location of the IDCS Application (used by IDCS APIs)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAppLocationUrl")
    String idcsAppLocationUrl;

    /**
     * The IDCS application display name associated with the instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAppDisplayName")
    String idcsAppDisplayName;

    /**
     * The IDCS application ID associated with the instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAppId")
    String idcsAppId;

    /**
     * The IDCS application name associated with the instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAppName")
    String idcsAppName;

    /**
     * The URL used as the primary audience for visual builder flows in this instance
     * type: string
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instancePrimaryAudienceUrl")
    String instancePrimaryAudienceUrl;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
