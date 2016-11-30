// Copyright 2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License"). You may
// not use this file except in compliance with the License. A copy of the
// License is located at
//
//     http://aws.amazon.com/apache2.0/
//
// or in the "license" file accompanying this file. This file is distributed
// on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
// express or implied. See the License for the specific language governing
// permissions and limitations under the License.

package operations

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	"net/http"
	"time"

	"golang.org/x/net/context"

	"github.com/go-openapi/errors"
	"github.com/go-openapi/runtime"
	cr "github.com/go-openapi/runtime/client"

	strfmt "github.com/go-openapi/strfmt"
)

// NewCreateDeploymentParams creates a new CreateDeploymentParams object
// with the default values initialized.
func NewCreateDeploymentParams() *CreateDeploymentParams {
	var ()
	return &CreateDeploymentParams{

		timeout: cr.DefaultTimeout,
	}
}

// NewCreateDeploymentParamsWithTimeout creates a new CreateDeploymentParams object
// with the default values initialized, and the ability to set a timeout on a request
func NewCreateDeploymentParamsWithTimeout(timeout time.Duration) *CreateDeploymentParams {
	var ()
	return &CreateDeploymentParams{

		timeout: timeout,
	}
}

// NewCreateDeploymentParamsWithContext creates a new CreateDeploymentParams object
// with the default values initialized, and the ability to set a context for a request
func NewCreateDeploymentParamsWithContext(ctx context.Context) *CreateDeploymentParams {
	var ()
	return &CreateDeploymentParams{

		Context: ctx,
	}
}

/*CreateDeploymentParams contains all the parameters to send to the API endpoint
for the create deployment operation typically these are written to a http.Request
*/
type CreateDeploymentParams struct {

	/*DeploymentToken
	  Deployment token

	*/
	DeploymentToken string
	/*Name
	  Name of environment

	*/
	Name string

	timeout    time.Duration
	Context    context.Context
	HTTPClient *http.Client
}

// WithTimeout adds the timeout to the create deployment params
func (o *CreateDeploymentParams) WithTimeout(timeout time.Duration) *CreateDeploymentParams {
	o.SetTimeout(timeout)
	return o
}

// SetTimeout adds the timeout to the create deployment params
func (o *CreateDeploymentParams) SetTimeout(timeout time.Duration) {
	o.timeout = timeout
}

// WithContext adds the context to the create deployment params
func (o *CreateDeploymentParams) WithContext(ctx context.Context) *CreateDeploymentParams {
	o.SetContext(ctx)
	return o
}

// SetContext adds the context to the create deployment params
func (o *CreateDeploymentParams) SetContext(ctx context.Context) {
	o.Context = ctx
}

// WithDeploymentToken adds the deploymentToken to the create deployment params
func (o *CreateDeploymentParams) WithDeploymentToken(deploymentToken string) *CreateDeploymentParams {
	o.SetDeploymentToken(deploymentToken)
	return o
}

// SetDeploymentToken adds the deploymentToken to the create deployment params
func (o *CreateDeploymentParams) SetDeploymentToken(deploymentToken string) {
	o.DeploymentToken = deploymentToken
}

// WithName adds the name to the create deployment params
func (o *CreateDeploymentParams) WithName(name string) *CreateDeploymentParams {
	o.SetName(name)
	return o
}

// SetName adds the name to the create deployment params
func (o *CreateDeploymentParams) SetName(name string) {
	o.Name = name
}

// WriteToRequest writes these params to a swagger request
func (o *CreateDeploymentParams) WriteToRequest(r runtime.ClientRequest, reg strfmt.Registry) error {

	r.SetTimeout(o.timeout)
	var res []error

	// query param deploymentToken
	qrDeploymentToken := o.DeploymentToken
	qDeploymentToken := qrDeploymentToken
	if qDeploymentToken != "" {
		if err := r.SetQueryParam("deploymentToken", qDeploymentToken); err != nil {
			return err
		}
	}

	// path param name
	if err := r.SetPathParam("name", o.Name); err != nil {
		return err
	}

	if len(res) > 0 {
		return errors.CompositeValidationError(res...)
	}
	return nil
}
