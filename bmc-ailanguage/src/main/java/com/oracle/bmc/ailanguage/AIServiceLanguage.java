/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage;

import com.oracle.bmc.ailanguage.requests.*;
import com.oracle.bmc.ailanguage.responses.*;

/**
 * OCI Language Service solutions can help enterprise customers integrate AI into their products immediately using our proven,
 * pre-trained and custom models or containers, without a need to set up an house team of AI and ML experts.
 * This allows enterprises to focus on business drivers and development work rather than AI and ML operations, which shortens the time to market.
 *
 * This service client uses CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER for all the operations by default if no circuit breaker configuration is defined by the user.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
public interface AIServiceLanguage extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this Region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Make a detect call to language detection pre-deployed model.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ailanguage/BatchDetectDominantLanguageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use BatchDetectDominantLanguage API.
     */
    BatchDetectDominantLanguageResponse batchDetectDominantLanguage(
            BatchDetectDominantLanguageRequest request);

    /**
     * Make a batch detect call to entity pre-deployed model
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ailanguage/BatchDetectLanguageEntitiesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use BatchDetectLanguageEntities API.
     */
    BatchDetectLanguageEntitiesResponse batchDetectLanguageEntities(
            BatchDetectLanguageEntitiesRequest request);

    /**
     * Make a detect call to the keyPhrase pre-deployed model.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ailanguage/BatchDetectLanguageKeyPhrasesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use BatchDetectLanguageKeyPhrases API.
     */
    BatchDetectLanguageKeyPhrasesResponse batchDetectLanguageKeyPhrases(
            BatchDetectLanguageKeyPhrasesRequest request);

    /**
     * Make a detect call to sentiment pre-deployed model.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ailanguage/BatchDetectLanguageSentimentsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use BatchDetectLanguageSentiments API.
     */
    BatchDetectLanguageSentimentsResponse batchDetectLanguageSentiments(
            BatchDetectLanguageSentimentsRequest request);

    /**
     * Make a detect call to text classification from the pre-deployed model.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ailanguage/BatchDetectLanguageTextClassificationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use BatchDetectLanguageTextClassification API.
     */
    BatchDetectLanguageTextClassificationResponse batchDetectLanguageTextClassification(
            BatchDetectLanguageTextClassificationRequest request);

    /**
     * Make a detect call to language detection pre-deployed model.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ailanguage/DetectDominantLanguageExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DetectDominantLanguage API.
     */
    DetectDominantLanguageResponse detectDominantLanguage(DetectDominantLanguageRequest request);

    /**
     * Make a detect call to enitiy pre-deployed model
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ailanguage/DetectLanguageEntitiesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DetectLanguageEntities API.
     */
    DetectLanguageEntitiesResponse detectLanguageEntities(DetectLanguageEntitiesRequest request);

    /**
     * Make a detect call to the keyPhrase pre-deployed model.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ailanguage/DetectLanguageKeyPhrasesExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DetectLanguageKeyPhrases API.
     */
    DetectLanguageKeyPhrasesResponse detectLanguageKeyPhrases(
            DetectLanguageKeyPhrasesRequest request);

    /**
     * Make a detect call to sentiment pre-deployed model.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ailanguage/DetectLanguageSentimentsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DetectLanguageSentiments API.
     */
    DetectLanguageSentimentsResponse detectLanguageSentiments(
            DetectLanguageSentimentsRequest request);

    /**
     * Make a detect call to text classification from the pre-deployed model.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     * This operation will not retry by default, users can also use RetryConfiguration.SDK_DEFAULT_RETRY_CONFIGURATION provided by the SDK to enable retries for it.
     * The specifics of the default retry strategy are described here https://docs.oracle.com/en-us/iaas/Content/API/SDKDocs/javasdkconcepts.htm#javasdkconcepts_topic_Retries
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ailanguage/DetectLanguageTextClassificationExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DetectLanguageTextClassification API.
     */
    DetectLanguageTextClassificationResponse detectLanguageTextClassification(
            DetectLanguageTextClassificationRequest request);
}
