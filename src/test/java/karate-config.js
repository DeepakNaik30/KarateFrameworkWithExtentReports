function fn() {
  var config = {

  }
  var beforeAll = karate.callSingle('classpath:examples/users/beforeall.feature')
  //var afterAll = karate.callSingle('classpath:examples/users/afterall.feature')
//  var beforeScenario = karate.callSingle('classpath:examples/users/beforeall.feature')

  return config;
}