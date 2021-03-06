/**

*/
package com.amazonaws.blox;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import com.amazonaws.blox.model.*;

/**
 * Interface for accessing Blox.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface Blox {

    /**
     * @param createEnvironmentRequest
     * @return Result of the createEnvironment operation returned by the service.
     * @sample Blox.createEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-blox-v2017-07-11/createEnvironment" target="_top">AWS
     *      API Documentation</a>
     */
    CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest createEnvironmentRequest);

    /**
     * @param describeEnvironmentRequest
     * @return Result of the describeEnvironment operation returned by the service.
     * @throws NotFoundException
     * @sample Blox.describeEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-blox-v2017-07-11/describeEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEnvironmentResult describeEnvironment(DescribeEnvironmentRequest describeEnvironmentRequest);

    /**
     * @param describeEnvironmentDeploymentRequest
     * @return Result of the describeEnvironmentDeployment operation returned by the service.
     * @sample Blox.describeEnvironmentDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-blox-v2017-07-11/describeEnvironmentDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEnvironmentDeploymentResult describeEnvironmentDeployment(DescribeEnvironmentDeploymentRequest describeEnvironmentDeploymentRequest);

    /**
     * @param describeEnvironmentRevisionRequest
     * @return Result of the describeEnvironmentRevision operation returned by the service.
     * @sample Blox.describeEnvironmentRevision
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-blox-v2017-07-11/describeEnvironmentRevision"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEnvironmentRevisionResult describeEnvironmentRevision(DescribeEnvironmentRevisionRequest describeEnvironmentRevisionRequest);

    /**
     * @param listEnvironmentDeploymentsRequest
     * @return Result of the listEnvironmentDeployments operation returned by the service.
     * @sample Blox.listEnvironmentDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-blox-v2017-07-11/listEnvironmentDeployments"
     *      target="_top">AWS API Documentation</a>
     */
    ListEnvironmentDeploymentsResult listEnvironmentDeployments(ListEnvironmentDeploymentsRequest listEnvironmentDeploymentsRequest);

    /**
     * @param listEnvironmentRevisionsRequest
     * @return Result of the listEnvironmentRevisions operation returned by the service.
     * @sample Blox.listEnvironmentRevisions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-blox-v2017-07-11/listEnvironmentRevisions"
     *      target="_top">AWS API Documentation</a>
     */
    ListEnvironmentRevisionsResult listEnvironmentRevisions(ListEnvironmentRevisionsRequest listEnvironmentRevisionsRequest);

    /**
     * @param listEnvironmentsRequest
     * @return Result of the listEnvironments operation returned by the service.
     * @sample Blox.listEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-blox-v2017-07-11/listEnvironments" target="_top">AWS
     *      API Documentation</a>
     */
    ListEnvironmentsResult listEnvironments(ListEnvironmentsRequest listEnvironmentsRequest);

    /**
     * @param startDeploymentRequest
     * @return Result of the startDeployment operation returned by the service.
     * @sample Blox.startDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-blox-v2017-07-11/startDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    StartDeploymentResult startDeployment(StartDeploymentRequest startDeploymentRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static BloxClientBuilder builder() {
        return new BloxClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}
