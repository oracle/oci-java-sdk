/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.model;

/**
 * A summary representation of an announcement. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AnnouncementSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AnnouncementSummary extends BaseAnnouncement {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referenceTicketNumber")
        private String referenceTicketNumber;

        public Builder referenceTicketNumber(String referenceTicketNumber) {
            this.referenceTicketNumber = referenceTicketNumber;
            this.__explicitlySet__.add("referenceTicketNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private String summary;

        public Builder summary(String summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOneTitle")
        private String timeOneTitle;

        public Builder timeOneTitle(String timeOneTitle) {
            this.timeOneTitle = timeOneTitle;
            this.__explicitlySet__.add("timeOneTitle");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOneType")
        private TimeOneType timeOneType;

        public Builder timeOneType(TimeOneType timeOneType) {
            this.timeOneType = timeOneType;
            this.__explicitlySet__.add("timeOneType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOneValue")
        private java.util.Date timeOneValue;

        public Builder timeOneValue(java.util.Date timeOneValue) {
            this.timeOneValue = timeOneValue;
            this.__explicitlySet__.add("timeOneValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeTwoTitle")
        private String timeTwoTitle;

        public Builder timeTwoTitle(String timeTwoTitle) {
            this.timeTwoTitle = timeTwoTitle;
            this.__explicitlySet__.add("timeTwoTitle");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeTwoType")
        private TimeTwoType timeTwoType;

        public Builder timeTwoType(TimeTwoType timeTwoType) {
            this.timeTwoType = timeTwoType;
            this.__explicitlySet__.add("timeTwoType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeTwoValue")
        private java.util.Date timeTwoValue;

        public Builder timeTwoValue(java.util.Date timeTwoValue) {
            this.timeTwoValue = timeTwoValue;
            this.__explicitlySet__.add("timeTwoValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("services")
        private java.util.List<String> services;

        public Builder services(java.util.List<String> services) {
            this.services = services;
            this.__explicitlySet__.add("services");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("affectedRegions")
        private java.util.List<String> affectedRegions;

        public Builder affectedRegions(java.util.List<String> affectedRegions) {
            this.affectedRegions = affectedRegions;
            this.__explicitlySet__.add("affectedRegions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("announcementType")
        private AnnouncementType announcementType;

        public Builder announcementType(AnnouncementType announcementType) {
            this.announcementType = announcementType;
            this.__explicitlySet__.add("announcementType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isBanner")
        private Boolean isBanner;

        public Builder isBanner(Boolean isBanner) {
            this.isBanner = isBanner;
            this.__explicitlySet__.add("isBanner");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("environmentName")
        private String environmentName;

        public Builder environmentName(String environmentName) {
            this.environmentName = environmentName;
            this.__explicitlySet__.add("environmentName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformType")
        private PlatformType platformType;

        public Builder platformType(PlatformType platformType) {
            this.platformType = platformType;
            this.__explicitlySet__.add("platformType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("chainId")
        private String chainId;

        public Builder chainId(String chainId) {
            this.chainId = chainId;
            this.__explicitlySet__.add("chainId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnnouncementSummary build() {
            AnnouncementSummary model =
                    new AnnouncementSummary(
                            this.id,
                            this.referenceTicketNumber,
                            this.summary,
                            this.timeOneTitle,
                            this.timeOneType,
                            this.timeOneValue,
                            this.timeTwoTitle,
                            this.timeTwoType,
                            this.timeTwoValue,
                            this.services,
                            this.affectedRegions,
                            this.announcementType,
                            this.lifecycleState,
                            this.isBanner,
                            this.timeCreated,
                            this.timeUpdated,
                            this.environmentName,
                            this.platformType,
                            this.chainId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnnouncementSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("referenceTicketNumber")) {
                this.referenceTicketNumber(model.getReferenceTicketNumber());
            }
            if (model.wasPropertyExplicitlySet("summary")) {
                this.summary(model.getSummary());
            }
            if (model.wasPropertyExplicitlySet("timeOneTitle")) {
                this.timeOneTitle(model.getTimeOneTitle());
            }
            if (model.wasPropertyExplicitlySet("timeOneType")) {
                this.timeOneType(model.getTimeOneType());
            }
            if (model.wasPropertyExplicitlySet("timeOneValue")) {
                this.timeOneValue(model.getTimeOneValue());
            }
            if (model.wasPropertyExplicitlySet("timeTwoTitle")) {
                this.timeTwoTitle(model.getTimeTwoTitle());
            }
            if (model.wasPropertyExplicitlySet("timeTwoType")) {
                this.timeTwoType(model.getTimeTwoType());
            }
            if (model.wasPropertyExplicitlySet("timeTwoValue")) {
                this.timeTwoValue(model.getTimeTwoValue());
            }
            if (model.wasPropertyExplicitlySet("services")) {
                this.services(model.getServices());
            }
            if (model.wasPropertyExplicitlySet("affectedRegions")) {
                this.affectedRegions(model.getAffectedRegions());
            }
            if (model.wasPropertyExplicitlySet("announcementType")) {
                this.announcementType(model.getAnnouncementType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("isBanner")) {
                this.isBanner(model.getIsBanner());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("environmentName")) {
                this.environmentName(model.getEnvironmentName());
            }
            if (model.wasPropertyExplicitlySet("platformType")) {
                this.platformType(model.getPlatformType());
            }
            if (model.wasPropertyExplicitlySet("chainId")) {
                this.chainId(model.getChainId());
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

    @Deprecated
    public AnnouncementSummary(
            String id,
            String referenceTicketNumber,
            String summary,
            String timeOneTitle,
            TimeOneType timeOneType,
            java.util.Date timeOneValue,
            String timeTwoTitle,
            TimeTwoType timeTwoType,
            java.util.Date timeTwoValue,
            java.util.List<String> services,
            java.util.List<String> affectedRegions,
            AnnouncementType announcementType,
            LifecycleState lifecycleState,
            Boolean isBanner,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String environmentName,
            PlatformType platformType,
            String chainId) {
        super(
                id,
                referenceTicketNumber,
                summary,
                timeOneTitle,
                timeOneType,
                timeOneValue,
                timeTwoTitle,
                timeTwoType,
                timeTwoValue,
                services,
                affectedRegions,
                announcementType,
                lifecycleState,
                isBanner,
                timeCreated,
                timeUpdated,
                environmentName,
                platformType,
                chainId);
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
        sb.append("AnnouncementSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnnouncementSummary)) {
            return false;
        }

        AnnouncementSummary other = (AnnouncementSummary) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }
}
