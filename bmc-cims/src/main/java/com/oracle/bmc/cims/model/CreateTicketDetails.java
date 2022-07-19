/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details relevant to the support ticket.
 * <p>
 **Caution:** Avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateTicketDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateTicketDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "severity",
        "resourceList",
        "title",
        "description",
        "contextualData"
    })
    public CreateTicketDetails(
            Severity severity,
            java.util.List<CreateResourceDetails> resourceList,
            String title,
            String description,
            ContextualData contextualData) {
        super();
        this.severity = severity;
        this.resourceList = resourceList;
        this.title = title;
        this.description = description;
        this.contextualData = contextualData;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The severity of the support ticket.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Severity severity;

        /**
         * The severity of the support ticket.
         * @param severity the value to set
         * @return this builder
         **/
        public Builder severity(Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /**
         * The list of resources.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceList")
        private java.util.List<CreateResourceDetails> resourceList;

        /**
         * The list of resources.
         * @param resourceList the value to set
         * @return this builder
         **/
        public Builder resourceList(java.util.List<CreateResourceDetails> resourceList) {
            this.resourceList = resourceList;
            this.__explicitlySet__.add("resourceList");
            return this;
        }
        /**
         * The title of the support ticket.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        /**
         * The title of the support ticket.
         * @param title the value to set
         * @return this builder
         **/
        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
            return this;
        }
        /**
         * The description of the support ticket.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the support ticket.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The context from where the ticket is getting created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contextualData")
        private ContextualData contextualData;

        /**
         * The context from where the ticket is getting created.
         * @param contextualData the value to set
         * @return this builder
         **/
        public Builder contextualData(ContextualData contextualData) {
            this.contextualData = contextualData;
            this.__explicitlySet__.add("contextualData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateTicketDetails build() {
            CreateTicketDetails __instance__ =
                    new CreateTicketDetails(
                            severity, resourceList, title, description, contextualData);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateTicketDetails o) {
            Builder copiedBuilder =
                    severity(o.getSeverity())
                            .resourceList(o.getResourceList())
                            .title(o.getTitle())
                            .description(o.getDescription())
                            .contextualData(o.getContextualData());

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
     * The severity of the support ticket.
     **/
    public enum Severity {
        Highest("HIGHEST"),
        High("HIGH"),
        Medium("MEDIUM"),
        ;

        private final String value;
        private static java.util.Map<String, Severity> map;

        static {
            map = new java.util.HashMap<>();
            for (Severity v : Severity.values()) {
                map.put(v.getValue(), v);
            }
        }

        Severity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Severity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Severity: " + key);
        }
    };
    /**
     * The severity of the support ticket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Severity severity;

    /**
     * The severity of the support ticket.
     * @return the value
     **/
    public Severity getSeverity() {
        return severity;
    }

    /**
     * The list of resources.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceList")
    private final java.util.List<CreateResourceDetails> resourceList;

    /**
     * The list of resources.
     * @return the value
     **/
    public java.util.List<CreateResourceDetails> getResourceList() {
        return resourceList;
    }

    /**
     * The title of the support ticket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    private final String title;

    /**
     * The title of the support ticket.
     * @return the value
     **/
    public String getTitle() {
        return title;
    }

    /**
     * The description of the support ticket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the support ticket.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The context from where the ticket is getting created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contextualData")
    private final ContextualData contextualData;

    /**
     * The context from where the ticket is getting created.
     * @return the value
     **/
    public ContextualData getContextualData() {
        return contextualData;
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
        sb.append("CreateTicketDetails(");
        sb.append("severity=").append(String.valueOf(this.severity));
        sb.append(", resourceList=").append(String.valueOf(this.resourceList));
        sb.append(", title=").append(String.valueOf(this.title));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", contextualData=").append(String.valueOf(this.contextualData));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateTicketDetails)) {
            return false;
        }

        CreateTicketDetails other = (CreateTicketDetails) o;
        return java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.resourceList, other.resourceList)
                && java.util.Objects.equals(this.title, other.title)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.contextualData, other.contextualData)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.resourceList == null ? 43 : this.resourceList.hashCode());
        result = (result * PRIME) + (this.title == null ? 43 : this.title.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.contextualData == null ? 43 : this.contextualData.hashCode());
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
