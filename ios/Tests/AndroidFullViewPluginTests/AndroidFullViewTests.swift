import XCTest
@testable import Plugin

class AndroidFullViewTests: XCTestCase {
    override func setUp() {
        super.setUp()
        // Put setup code here. This method is called before the invocation of each test method in the class.
    }

    override func tearDown() {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
        super.tearDown()
    }

    func testTop() {

        let implementation = AndroidFullView()
        let value = 0
        let result = implementation.top()

        XCTAssertEqual(value, result)
    }
}
