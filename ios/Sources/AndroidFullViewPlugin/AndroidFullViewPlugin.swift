import Foundation
import Capacitor

/**
 * Please read the Capacitor iOS Plugin Development Guide
 * here: https://capacitorjs.com/docs/plugins/ios
 */
@objc(AndroidFullView)
public class AndroidFullViewPlugin: CAPPlugin, CAPBridgedPlugin {
    public let identifier = "AndroidFullViewPlugin"
    public let jsName = "AndroidFullView"
    public let pluginMethods: [CAPPluginMethod] = [
        CAPPluginMethod(name: "top", returnType: CAPPluginReturnPromise)
    ]
    private let implementation = AndroidFullView()

    @objc func top(_ call: CAPPluginCall) {
        call.resolve([
            "value": implementation.top()
        ])
    }
}
