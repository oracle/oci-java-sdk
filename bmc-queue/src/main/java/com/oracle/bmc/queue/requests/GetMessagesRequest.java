/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue.requests;

import com.oracle.bmc.queue.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/queue/GetMessagesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetMessagesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public class GetMessagesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The unique queue identifier. */
    private String queueId;

    /** The unique queue identifier. */
    public String getQueueId() {
        return queueId;
    }
    /**
     * If the {@code visibilityInSeconds} parameter is set, messages will be hidden for {@code
     * visibilityInSeconds} seconds and won't be consumable by other consumers during that time. If
     * it isn't set it defaults to the value set at the queue level.
     *
     * <p>Using a {@code visibilityInSeconds} value of 0 effectively acts as a peek functionality.
     * Messages retrieved that way aren't meant to be deleted because they will most likely be
     * delivered to another consumer as their visibility won't change, but will still increase the
     * delivery count by one.
     */
    private Integer visibilityInSeconds;

    /**
     * If the {@code visibilityInSeconds} parameter is set, messages will be hidden for {@code
     * visibilityInSeconds} seconds and won't be consumable by other consumers during that time. If
     * it isn't set it defaults to the value set at the queue level.
     *
     * <p>Using a {@code visibilityInSeconds} value of 0 effectively acts as a peek functionality.
     * Messages retrieved that way aren't meant to be deleted because they will most likely be
     * delivered to another consumer as their visibility won't change, but will still increase the
     * delivery count by one.
     */
    public Integer getVisibilityInSeconds() {
        return visibilityInSeconds;
    }
    /**
     * If the {@code timeoutInSeconds parameter} isn't set or it is set to a value greater than 0,
     * the request is using the long-polling mode and will only return when a message is available
     * for consumption (it does not wait for limit messages but still only returns at-most limit
     * messages) or after {@code timeoutInSeconds} seconds (in which case it will return an empty
     * response), whichever comes first.
     *
     * <p>If the parameter is set to 0, the request is using the short-polling mode and immediately
     * returns whether messages have been retrieved or not. In same rare-cases a long-polling
     * request could be interrupted (returned with empty response) before the end of the timeout.
     */
    private Integer timeoutInSeconds;

    /**
     * If the {@code timeoutInSeconds parameter} isn't set or it is set to a value greater than 0,
     * the request is using the long-polling mode and will only return when a message is available
     * for consumption (it does not wait for limit messages but still only returns at-most limit
     * messages) or after {@code timeoutInSeconds} seconds (in which case it will return an empty
     * response), whichever comes first.
     *
     * <p>If the parameter is set to 0, the request is using the short-polling mode and immediately
     * returns whether messages have been retrieved or not. In same rare-cases a long-polling
     * request could be interrupted (returned with empty response) before the end of the timeout.
     */
    public Integer getTimeoutInSeconds() {
        return timeoutInSeconds;
    }
    /** The limit parameter controls how many messages is returned at-most. */
    private Integer limit;

    /** The limit parameter controls how many messages is returned at-most. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** Optional parameter to filter the channels. */
    private String channelFilter;

    /** Optional parameter to filter the channels. */
    public String getChannelFilter() {
        return channelFilter;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetMessagesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The unique queue identifier. */
        private String queueId = null;

        /**
         * The unique queue identifier.
         *
         * @param queueId the value to set
         * @return this builder instance
         */
        public Builder queueId(String queueId) {
            this.queueId = queueId;
            return this;
        }

        /**
         * If the {@code visibilityInSeconds} parameter is set, messages will be hidden for {@code
         * visibilityInSeconds} seconds and won't be consumable by other consumers during that time.
         * If it isn't set it defaults to the value set at the queue level.
         *
         * <p>Using a {@code visibilityInSeconds} value of 0 effectively acts as a peek
         * functionality. Messages retrieved that way aren't meant to be deleted because they will
         * most likely be delivered to another consumer as their visibility won't change, but will
         * still increase the delivery count by one.
         */
        private Integer visibilityInSeconds = null;

        /**
         * If the {@code visibilityInSeconds} parameter is set, messages will be hidden for {@code
         * visibilityInSeconds} seconds and won't be consumable by other consumers during that time.
         * If it isn't set it defaults to the value set at the queue level.
         *
         * <p>Using a {@code visibilityInSeconds} value of 0 effectively acts as a peek
         * functionality. Messages retrieved that way aren't meant to be deleted because they will
         * most likely be delivered to another consumer as their visibility won't change, but will
         * still increase the delivery count by one.
         *
         * @param visibilityInSeconds the value to set
         * @return this builder instance
         */
        public Builder visibilityInSeconds(Integer visibilityInSeconds) {
            this.visibilityInSeconds = visibilityInSeconds;
            return this;
        }

        /**
         * If the {@code timeoutInSeconds parameter} isn't set or it is set to a value greater than
         * 0, the request is using the long-polling mode and will only return when a message is
         * available for consumption (it does not wait for limit messages but still only returns
         * at-most limit messages) or after {@code timeoutInSeconds} seconds (in which case it will
         * return an empty response), whichever comes first.
         *
         * <p>If the parameter is set to 0, the request is using the short-polling mode and
         * immediately returns whether messages have been retrieved or not. In same rare-cases a
         * long-polling request could be interrupted (returned with empty response) before the end
         * of the timeout.
         */
        private Integer timeoutInSeconds = null;

        /**
         * If the {@code timeoutInSeconds parameter} isn't set or it is set to a value greater than
         * 0, the request is using the long-polling mode and will only return when a message is
         * available for consumption (it does not wait for limit messages but still only returns
         * at-most limit messages) or after {@code timeoutInSeconds} seconds (in which case it will
         * return an empty response), whichever comes first.
         *
         * <p>If the parameter is set to 0, the request is using the short-polling mode and
         * immediately returns whether messages have been retrieved or not. In same rare-cases a
         * long-polling request could be interrupted (returned with empty response) before the end
         * of the timeout.
         *
         * @param timeoutInSeconds the value to set
         * @return this builder instance
         */
        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        /** The limit parameter controls how many messages is returned at-most. */
        private Integer limit = null;

        /**
         * The limit parameter controls how many messages is returned at-most.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** Optional parameter to filter the channels. */
        private String channelFilter = null;

        /**
         * Optional parameter to filter the channels.
         *
         * @param channelFilter the value to set
         * @return this builder instance
         */
        public Builder channelFilter(String channelFilter) {
            this.channelFilter = channelFilter;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(GetMessagesRequest o) {
            queueId(o.getQueueId());
            visibilityInSeconds(o.getVisibilityInSeconds());
            timeoutInSeconds(o.getTimeoutInSeconds());
            limit(o.getLimit());
            opcRequestId(o.getOpcRequestId());
            channelFilter(o.getChannelFilter());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetMessagesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetMessagesRequest
         */
        public GetMessagesRequest build() {
            GetMessagesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetMessagesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetMessagesRequest
         */
        public GetMessagesRequest buildWithoutInvocationCallback() {
            GetMessagesRequest request = new GetMessagesRequest();
            request.queueId = queueId;
            request.visibilityInSeconds = visibilityInSeconds;
            request.timeoutInSeconds = timeoutInSeconds;
            request.limit = limit;
            request.opcRequestId = opcRequestId;
            request.channelFilter = channelFilter;
            return request;
            // new GetMessagesRequest(queueId, visibilityInSeconds, timeoutInSeconds, limit,
            // opcRequestId, channelFilter);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .queueId(queueId)
                .visibilityInSeconds(visibilityInSeconds)
                .timeoutInSeconds(timeoutInSeconds)
                .limit(limit)
                .opcRequestId(opcRequestId)
                .channelFilter(channelFilter);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",queueId=").append(String.valueOf(this.queueId));
        sb.append(",visibilityInSeconds=").append(String.valueOf(this.visibilityInSeconds));
        sb.append(",timeoutInSeconds=").append(String.valueOf(this.timeoutInSeconds));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",channelFilter=").append(String.valueOf(this.channelFilter));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetMessagesRequest)) {
            return false;
        }

        GetMessagesRequest other = (GetMessagesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.queueId, other.queueId)
                && java.util.Objects.equals(this.visibilityInSeconds, other.visibilityInSeconds)
                && java.util.Objects.equals(this.timeoutInSeconds, other.timeoutInSeconds)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.channelFilter, other.channelFilter);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.queueId == null ? 43 : this.queueId.hashCode());
        result =
                (result * PRIME)
                        + (this.visibilityInSeconds == null
                                ? 43
                                : this.visibilityInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.timeoutInSeconds == null ? 43 : this.timeoutInSeconds.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.channelFilter == null ? 43 : this.channelFilter.hashCode());
        return result;
    }
}
