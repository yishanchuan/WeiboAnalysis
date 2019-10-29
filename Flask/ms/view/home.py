from flakon import JsonBlueprint

home = JsonBlueprint('home', __name__)

@home.route('/', methods=['GET', 'POST'])
def index():
    return {}