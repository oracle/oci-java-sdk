/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details about the LimitItem object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LimitItem.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LimitItem extends Item {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("itemKey")
        private String itemKey;

        public Builder itemKey(String itemKey) {
            this.itemKey = itemKey;
            this.__explicitlySet__.add("itemKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private Category category;

        public Builder category(Category category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subCategory")
        private SubCategory subCategory;

        public Builder subCategory(SubCategory subCategory) {
            this.subCategory = subCategory;
            this.__explicitlySet__.add("subCategory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("issueType")
        private IssueType issueType;

        public Builder issueType(IssueType issueType) {
            this.issueType = issueType;
            this.__explicitlySet__.add("issueType");
            return this;
        }
        /**
         * The current service limit for the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentLimit")
        private Integer currentLimit;

        /**
         * The current service limit for the resource.
         * @param currentLimit the value to set
         * @return this builder
         **/
        public Builder currentLimit(Integer currentLimit) {
            this.currentLimit = currentLimit;
            this.__explicitlySet__.add("currentLimit");
            return this;
        }
        /**
         * The current resource usage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentUsage")
        private Integer currentUsage;

        /**
         * The current resource usage.
         * @param currentUsage the value to set
         * @return this builder
         **/
        public Builder currentUsage(Integer currentUsage) {
            this.currentUsage = currentUsage;
            this.__explicitlySet__.add("currentUsage");
            return this;
        }
        /**
         * The new service limit being requested for the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requestedLimit")
        private Integer requestedLimit;

        /**
         * The new service limit being requested for the resource.
         * @param requestedLimit the value to set
         * @return this builder
         **/
        public Builder requestedLimit(Integer requestedLimit) {
            this.requestedLimit = requestedLimit;
            this.__explicitlySet__.add("requestedLimit");
            return this;
        }
        /**
         * The status of the request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("limitStatus")
        private LimitStatus limitStatus;

        /**
         * The status of the request.
         * @param limitStatus the value to set
         * @return this builder
         **/
        public Builder limitStatus(LimitStatus limitStatus) {
            this.limitStatus = limitStatus;
            this.__explicitlySet__.add("limitStatus");
            return this;
        }
        /**
         * The message to customer for partially approved and rejected limit requests
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerMessage")
        private String customerMessage;

        /**
         * The message to customer for partially approved and rejected limit requests
         * @param customerMessage the value to set
         * @return this builder
         **/
        public Builder customerMessage(String customerMessage) {
            this.customerMessage = customerMessage;
            this.__explicitlySet__.add("customerMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LimitItem build() {
            LimitItem model =
                    new LimitItem(
                            this.itemKey,
                            this.name,
                            this.category,
                            this.subCategory,
                            this.issueType,
                            this.currentLimit,
                            this.currentUsage,
                            this.requestedLimit,
                            this.limitStatus,
                            this.customerMessage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LimitItem model) {
            if (model.wasPropertyExplicitlySet("itemKey")) {
                this.itemKey(model.getItemKey());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("subCategory")) {
                this.subCategory(model.getSubCategory());
            }
            if (model.wasPropertyExplicitlySet("issueType")) {
                this.issueType(model.getIssueType());
            }
            if (model.wasPropertyExplicitlySet("currentLimit")) {
                this.currentLimit(model.getCurrentLimit());
            }
            if (model.wasPropertyExplicitlySet("currentUsage")) {
                this.currentUsage(model.getCurrentUsage());
            }
            if (model.wasPropertyExplicitlySet("requestedLimit")) {
                this.requestedLimit(model.getRequestedLimit());
            }
            if (model.wasPropertyExplicitlySet("limitStatus")) {
                this.limitStatus(model.getLimitStatus());
            }
            if (model.wasPropertyExplicitlySet("customerMessage")) {
                this.customerMessage(model.getCustomerMessage());
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
    public LimitItem(
            String itemKey,
            String name,
            Category category,
            SubCategory subCategory,
            IssueType issueType,
            Integer currentLimit,
            Integer currentUsage,
            Integer requestedLimit,
            LimitStatus limitStatus,
            String customerMessage) {
        super(itemKey, name, category, subCategory, issueType);
        this.currentLimit = currentLimit;
        this.currentUsage = currentUsage;
        this.requestedLimit = requestedLimit;
        this.limitStatus = limitStatus;
        this.customerMessage = customerMessage;
    }

    /**
     * The current service limit for the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentLimit")
    private final Integer currentLimit;

    /**
     * The current service limit for the resource.
     * @return the value
     **/
    public Integer getCurrentLimit() {
        return currentLimit;
    }

    /**
     * The current resource usage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentUsage")
    private final Integer currentUsage;

    /**
     * The current resource usage.
     * @return the value
     **/
    public Integer getCurrentUsage() {
        return currentUsage;
    }

    /**
     * The new service limit being requested for the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestedLimit")
    private final Integer requestedLimit;

    /**
     * The new service limit being requested for the resource.
     * @return the value
     **/
    public Integer getRequestedLimit() {
        return requestedLimit;
    }

    /**
     * The status of the request.
     **/
    public enum LimitStatus {
        Approved("APPROVED"),
        PartiallyApproved("PARTIALLY_APPROVED"),
        NotApproved("NOT_APPROVED"),
        Rejected("REJECTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LimitStatus.class);

        private final String value;
        private static java.util.Map<String, LimitStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (LimitStatus v : LimitStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LimitStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LimitStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LimitStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("limitStatus")
    private final LimitStatus limitStatus;

    /**
     * The status of the request.
     * @return the value
     **/
    public LimitStatus getLimitStatus() {
        return limitStatus;
    }

    /**
     * The message to customer for partially approved and rejected limit requests
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerMessage")
    private final String customerMessage;

    /**
     * The message to customer for partially approved and rejected limit requests
     * @return the value
     **/
    public String getCustomerMessage() {
        return customerMessage;
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
        sb.append("LimitItem(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", currentLimit=").append(String.valueOf(this.currentLimit));
        sb.append(", currentUsage=").append(String.valueOf(this.currentUsage));
        sb.append(", requestedLimit=").append(String.valueOf(this.requestedLimit));
        sb.append(", limitStatus=").append(String.valueOf(this.limitStatus));
        sb.append(", customerMessage=").append(String.valueOf(this.customerMessage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LimitItem)) {
            return false;
        }

        LimitItem other = (LimitItem) o;
        return java.util.Objects.equals(this.currentLimit, other.currentLimit)
                && java.util.Objects.equals(this.currentUsage, other.currentUsage)
                && java.util.Objects.equals(this.requestedLimit, other.requestedLimit)
                && java.util.Objects.equals(this.limitStatus, other.limitStatus)
                && java.util.Objects.equals(this.customerMessage, other.customerMessage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.currentLimit == null ? 43 : this.currentLimit.hashCode());
        result = (result * PRIME) + (this.currentUsage == null ? 43 : this.currentUsage.hashCode());
        result =
                (result * PRIME)
                        + (this.requestedLimit == null ? 43 : this.requestedLimit.hashCode());
        result = (result * PRIME) + (this.limitStatus == null ? 43 : this.limitStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.customerMessage == null ? 43 : this.customerMessage.hashCode());
        return result;
    }
}
